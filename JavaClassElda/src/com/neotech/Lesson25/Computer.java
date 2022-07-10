package com.neotech.Lesson25;

public class Computer {
//	Homework: 
//	    ▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//	    ▪ Define some common behavior (methods) and some fields in the parent class, and override some of the methods in the child classes.
//	    ▪ Define some methods specific to the child classes.
//	    ▪ Create objects of the child classes and store them in an array.
//	    ▪ Loop through each object and execute available methods.

	public void storage() {
		System.out.println("All computers have storage ");

	}

	public void antiVirus() {
		System.out.println("All computers have anti Virus");

	}
}
class Apple extends Computer {
	public void storage() {
		System.out.println("Apple has a lot of storage");

	}

	public void speed() {
		System.out.println("Apple runs very fast ");

	}
}

class Lenovo extends Computer {

	public void storage() {
		System.out.println("Lenovo doesn't have a lot of storage");
	}

	public void battery() {
		System.out.println("Lenovo has a good battery  ");

	}
}

class Hp extends Computer {
	public void storage() {
		System.out.println("HP saves a lot of data");

	}
}

class Dell extends Computer {
	public void storage() {
		System.out.println("Dell has a lot of storage");

	}

	public void screen() {
		System.out.println("Dell is also tuchscreen");
	}
}