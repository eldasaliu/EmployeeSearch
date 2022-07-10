package com.neotech.Lesson25;

public class VehicletTest {

	public static void main(String[] args) {
		// not possible to instantiate
		// Vehicle v = new Vehicle("Red");
		// Car c = new Car("Red", "Tesla");

		Vehicle tesla = new Tesla("Black", "Sedan", "Tesla");
		tesla.drive(); // runtime polymorphism
		tesla.stop();
		tesla.start();
		tesla.brake();
//		tesla.display(); display() does not exist in Vehicle class.

		System.out.println("=====================================");

		Toyota toyota1 = new Toyota("Grey", "SUV", "Toyota");
		Vehicle toyota2 = new Toyota("Black", "Sedan", "Toyota");

		// these run the same method
		// if we do not have start() as abstract in the class Vehicle
		// we will not be able to do this
		toyota1.start();
		toyota2.start();

		Toyota.total();
	}

}
	}

}
