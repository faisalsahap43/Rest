package com.ems.non_bdd;

import java.io.PrintStream;

public class methodChaining {
	
	String modeOfTravel;
	String destination;

	public String getModeOfTravel() {
		return modeOfTravel;
	}

	public methodChaining setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
		return this; //this keyword returns the current class object
	}

	public String getDestination() {
		return destination;
	}

	public methodChaining setDestination(String destination) {
		this.destination = destination;
		return this;
	}
	
	public void interruption() {
		System.out.println(getDestination());
		System.out.println("Great..!! Enjoy the trip..!!");
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("System.out.prinln is the epitome of method chaining.");
		PrintStream ps = System.out;
		ps.println("Find the concept where System class is the best example..??");
		System.out.println();
		

		
		methodChaining trip = new methodChaining();
		
		trip.setDestination("Los Angels");
		trip.setModeOfTravel("flight");
		trip.interruption();
		
		System.out.println();
		
		trip.setDestination("Texas").setModeOfTravel("flight").interruption(); 
		
		
		
		
		
		
		
	}

}
