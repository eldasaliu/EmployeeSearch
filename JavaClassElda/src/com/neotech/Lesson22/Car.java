package com.neotech.Lesson22;

public class Car {
	String make, model;
​
	Car() {
		System.out.println("I am a parent default constructor!!!");
	}
​
	Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
}
​
class Mercedes extends Car {
	String sportsModel;
​
	Mercedes() {
		// super(); // super() is called by default
		// super("Default Make", "Default Model");
		this("Default Make", "Default Model", "Default Sports");
		System.out.println("I am a child default constructor!!!");
	}
​
	Mercedes(String make, String model, String sportsModel) {
		// super(); // super() is called by default
​
		// Call the super constructor to initialize
		// instance variables in the parent class
		super(make, model);
​
		// Use this keyword to initialize
		// instance variables in the child class
		this.sportsModel = sportsModel;
	}
​
	void display() {
		System.out.println(make + " " + model + " " + sportsModel);
	}
​
}
}
