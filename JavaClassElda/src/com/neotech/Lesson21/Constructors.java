package com.neotech.Lesson21;

public class Constructors {

	Constructors() {
​
		this(3); // Must be the first statement in the constructor
		// this(5,7); // Compile Error, it is the second statement
​
		System.out.println("Hi");
	}
​
	Constructors(int x) {
		this(6, 2);
		System.out.println("Hello");
	}
​
	Constructors(int x, int y) {
		System.out.println("How are you");
	}
​
	public static void main(String[] args) {
		// Constructors obj1 = new Constructors(3, 5);
		Constructors obj2 = new Constructors(4);
	}
​
}
}
