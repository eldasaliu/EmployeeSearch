package com.neotech.Lesson21;

public class USA {
	// instance variables
	String state, stateCapital;
​
	// If we define a constructor with parameter,
	// there is NO default constructor
​
	// constructor
	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}
​
	// methods
	public void displayState() {
		System.out.println(state);
	}
​
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
​
	// Can I call a method from inside another method?
	public void displayInfo() {
		this.displayState(); // Compiler by default is adding this keyword
		displayStateCapital();
	}
​
	public static void main(String[] args) {
		USA us1 = new USA("New Jersey", "Trenton");
		us1.displayInfo();
​
		System.out.println("----------------");
		USA us2 = new USA("Delaware", "Dover");
		us2.displayInfo();
	}
​
}