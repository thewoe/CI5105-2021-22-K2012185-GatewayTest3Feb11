package uk.ac.kingston.ku63026.gatewaytest2.model;
/**
 *
 * @author dave
 * IMPORTANT: you should not modify this code for this Gateway Test
 */

public class Event{	      	   		  	      	
  private String name;	      	   		  	      	
  private int capacity;	      	   		  	      	
  private int ticketsSold;	      	   		  	      	

    /**
     * Default Constructor for Event
     * Initialises attributes to their default values
     */
    public Event(){	      	   		  	      	
    this.name="Unknown";	      	   		  	      	
    this.capacity=0;	      	   		  	      	
    this.ticketsSold=0;	      	   		  	      	
  }	      	   		  	      	

    /**
     * Parameterised Constructor
     * @param name
     * @param capacity
     * ticketsSold is initialised to 0
     */
    public Event(String name, int capacity){	      	   		  	      	
    this.name=name;	      	   		  	      	
    this.capacity=capacity;	      	   		  	      	
    this.ticketsSold=0;	      	   		  	      	
  }	
	      	   		  	      	
    /**
     * Indicates if any tickets are available
     * @return boolean
     */
    public boolean ticketsAvailable(){	      	   		  	      	
    return capacity > ticketsSold;	      	   		  	      	
  }	      	   		  	      	
	      	   		  	      	
    /**
     *
     * Increments ticketsSold if one is available
     * Indicates if a ticket has been successfully sold
     * @return boolean
     */
    public boolean sellTicket(){	      	   		  	      	
    if (ticketsAvailable()){	      	   		  	      	
      ticketsSold++;	      	   		  	      	
      return true;	      	   		  	      	
    }	      	   		  	      	
    return false;	      	   		  	      	
  }	      	   		  	      	
	      	   		  	      	
    /**
     * Set the value of ticketsSold
     * @param ticketsSold
     */
    public void setTicketsSold(int ticketsSold)	      	   		  	      	
  {	      	   		  	      	
    if (ticketsSold <= this.capacity){	      	   		  	      	
      this.ticketsSold = ticketsSold;	      	   		  	      	
    }	      	   		  	      	
	      	   		  	      	
  }	      	   		  	      	
	      	   		  	      	
    /**
     * Get the value of ticketsSold
     * @return ticketsSold
     */
    public int getTicketsSold()	      	   		  	      	
  {	      	   		  	      	
     return this.ticketsSold;	      	   		  	      	
  }	      	   		  	      	
	      	   		  	      	
    /**
     * Set the value of capacity
     * @param capacity
     */
    public void setCapacity(int capacity)	      	   		  	      	
  {	      	   		  	      	
     this.capacity = capacity;	      	   		  	      	
  }	      	   		  	      	
	      	   		  	      	
    /**
     * Get the value of capacity
     * @return capacity
     */
    public int getCapacity()	      	   		  	      	
  {	      	   		  	      	
     return this.capacity;	      	   		  	      	
  }	      	   		  	      	
	      	   		  	      	
    /**
     * Set the value of name
     * @param name
     */
    public void setName(String name)	      	   		  	      	
  {	      	   		  	      	
     this.name = name;	      	   		  	      	
  }	      	   		  	      	
	      	   		  	      	
    /**
     * Get the value of name
     * @return name
     */
    public String getName()	      	   		  	      	
  {	      	   		  	      	
     return this.name;	      	   		  	      	
  }	      	   		  	      	

    /**
     * A String representation of an Event
     * @return String
     */
    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", capacity=" + capacity + ", ticketsSold=" + ticketsSold + '}';
    }

     /**
     * This produces a simple String representation of an Event in a csv format
     * @return A String with a csv view of the Event
     */
    public String printEvent(){
         return "Event " + this.getName() + System.lineSeparator() + "Capacity: " + this.getCapacity() + System.lineSeparator() + "Tickets Sold: " + this.getTicketsSold();
    }
}