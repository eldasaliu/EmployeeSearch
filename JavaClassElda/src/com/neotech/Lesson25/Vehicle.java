package com.neotech.Lesson25;

public class Vehicle {
String color;
static int totalVehicles;


Vehicle(String color){
	

this.color=color;
totalVehicles++;

}
public static void total() {
	System.out.println("We have built a total of"+ totalVehicles + "vehicles");
}
	
	public void drive() {
		System.out.println("Vehicle drives");
		
	}
	public void stop()
	{
		System.out.println("Vehicle stops");
		
	}

	public abstract void start();

	public abstract void brake();
}

abstract class Car extends Vehicle {
	String carType;

	Car(String color, String carType) {
		super(color);
		this.carType = carType;
	}

	// implement abstract method brake()
	public void brake() {
		System.out.println(carType + " have brakes!");
	}
	// you can create abstract methods here as well
//	public abstract void carDetails();
}

class Tesla extends Car {
	String make;

	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	// implementing unimplemented method
	public void start() {
		System.out.println(make + " starts remotely.");
	}

	// overide other methods
	public void drive() {
		System.out.println(make + " drives on autopilot!");
	}

	public void display() {
		System.out.println("we have a " + color + " " + make + " " + carType);
	}

}

class Toyota extends Car {
	String make;

	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	@Override
	public void start() {

		System.out.println(make + " has a keyless start");
	}
}