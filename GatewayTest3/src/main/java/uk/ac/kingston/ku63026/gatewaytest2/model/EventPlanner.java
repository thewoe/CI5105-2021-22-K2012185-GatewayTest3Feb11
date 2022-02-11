/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ku63026.gatewaytest2.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * You will need to modify this class to answer the questions
 * @author 
 */
public class EventPlanner {
    
    private static EventPlanner INSTANCE = new EventPlanner();
    
    public static EventPlanner getInstance() {
        if (INSTANCE==null) {
            INSTANCE = new EventPlanner();
            //System.out.println("New EventManager instance created");
        }
        //System.out.println("Using the first EventManager instance created");
        return INSTANCE;
    }
    

    // GWT2Q1 List relationship with Event and Getters and Setters
    // Attribute defines a null List
    
   
    private List<Event> events;
    
    // GWT2Q2 define the constructors 
    // A default constructor the initialises an empty list that is an ArrayList
    // A parameterised constructor that takes a List 
    // possibly this could take an ArrayList

    /**
     *
     */
    public EventPlanner() {
        this.events = new ArrayList();
    }

    /**
     *
     * @param events
     */
    public EventPlanner(List<Event> events) {
        this.events = events;
    }
    
  // GWT2Q3 add the ability to add an Event to the planner
  // returns true if successfully added
  // GWT2Q4 only add the event if it is not already in the list - this doesn't use a Set

    /**
     *
     * @param event
     * @return
     */
  public boolean addEvent(Event event){
      if( !this.events.contains(event)){
          return this.events.add(event);
      }
      return false;
  }

// GWTQ5 return the amount of tickets sold to all the Events

    /**
     *
     * @return
     */
public int totalTicketsSold(){
    int total = 0;
    for (Event e: this.events){
        total += e.getTicketsSold();
    }
    return total;
}
    /**
     * Get the value of events
     *
     * @return the value of events
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     * Set the value of events
     *
     * @param events new value of events
     */
    public void setEvents(List<Event> events) {
        this.events = events;
    }

      /**
     * Read ferries from a csv file using the paramerised constuctor Ferry(String, int)
     * and set the seats booked using setSeatsBooked
     * @param filename the name of the csv file
     */
    public void readEvents(String filename){
        try(Scanner in = new Scanner(new File(filename))){
            while (in.hasNextLine()){
                String[] attribs = in.nextLine().split(",");
                Event e = new Event(attribs[0],Integer.parseInt(attribs[1]) );
                e.setTicketsSold(Integer.parseInt(attribs[2]));
                events.add(e);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
     
    /**
     * Print all the events using whatever format is specified in the Event printEvent() method
     * 
     * @return a String representation of the events in the current printEvent() format
     * 
     */
    public String printEvents(){
     StringBuilder allEvents = new StringBuilder();
     for (Event e: events){
       allEvents.append(e.printEvent());
       allEvents.append(System.lineSeparator());  
       allEvents.append(System.lineSeparator());
     }
     allEvents.append("Total Tickets Sold: " + this.totalTicketsSold());
     return allEvents.toString(); 
    }
    
    public void getTheEvent(String selectedText) {
        for (int i=0; i<this.events.size(); i++) {
            if (this.events.get(i).getName().equals(selectedText)) {
                this.events.get(i).printEvent();
            }
        }
    }
    
    public int getSelectedEvent(String selectedText) {
        String searchableText = selectedText.trim();
        int index = 0;
        System.out.println(this.events.size());
        for (int i=0; i<this.getEvents().size(); i++) {
            if (searchableText.equals(this.events.get(i).getName())) {
               index = i;
               break;
            }
        }
        return index;
    }
    
    public void deleteEvent(String selectedEvent) {
        int indexToRemove = this.getSelectedEvent(selectedEvent);
        this.events.remove(indexToRemove);
    }
    

  
}
