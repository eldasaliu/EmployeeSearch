package com.neotech.Lesson20;

public class CarDemo {

	public static void main(String[] args) {

		// creating object with default constructor
		Car car = new Car();
		car.make = "Tesla";
		car.model = "X";
		car.year = 2022;
		car.printDetails();

		// creating an object with parametrized constructor
		Car car1 = new Car("BMW", "M5", 2022);
		car1.printDetails();

	}

}