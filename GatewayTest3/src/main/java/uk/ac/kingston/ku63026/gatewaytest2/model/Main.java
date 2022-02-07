package uk.ac.kingston.ku63026.gatewaytest2.model;

import java.util.ArrayList;
import java.util.List;

public class Main{
    // This class is for testing your code before submitting
    // There is some test code for the provided Event class
    // You can modify this class 
  public static void main(String[] args){
     // Demonstrate that all the code works 
        // Reads in the file Ferries.csv
        // Creates all the ferries and prints a csv view of them
        EventPlanner ep = new EventPlanner();
        ep.readEvents("Events.csv");
        System.out.println(ep.printEvents());
        
        // System.out.println("Total Tickets Sold: " + ep.totalTicketsSold());
        
        // Make a commit and push to your GatewayTest3Feb11 repository using the commit message
        // GT3Start: Start point for Gateway Test - start line uncommented
        // to do this first comment out the line above to demonstrate that you are ready to start the Gateway Test
       
  }	      	   		  	      	

  
}