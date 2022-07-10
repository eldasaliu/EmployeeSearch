package com.neotech.Lesson22;

public class Homework3 {
//	
//	Homework 3:
//	    Create a class with 3 overloaded private methods.
//	    Then call each overloaded methods with specific arguments
	// and observe the results.

	private void addition(int a, int b) {
		System.out.println("The addition of two numbers : " + (a + b));

	}

	private void multiply(double c, int d) {
		System.out.println("The multiplication of two numbers : " + (c * d));
	}

	private void subtraction(int e, int f, int g) {
		System.out.println("The substraction of three numbers:" + (e - f - g));

	}

	public static void main(String[] args) {
		Homework3 h = new Homework3();
		h.addition(20, 30);
		h.multiply(4.5, 7);
		h.subtraction(30, 6, 14);
	}

}
