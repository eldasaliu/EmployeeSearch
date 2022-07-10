package com.neotech.Lesson24;

public class OverloadingMainMethod {

public class OverloadingMainMethod {
	// Can we overload main method? YES
​
	public static void main(int[] args) {
		System.out.println("Main method with int array parameters");
	}
​
	private static void main(String arg1, String arg2) {
		System.out.println("Main method with two String parameters");
	}
​
	public static void main(int arg1, int arg2) {
		System.out.println("Main method with two int parameters");
	}
​
	public static void main(String[] sherzod) {
		// Java looks for a main method with this signature
		// signature = method name (main) + parameters (String array)
		System.out.println("Main method with String array parameters");
​
		OverloadingMainMethod.main(3, 5);
​
		// I don't need to specify the class name when I am inside the same class
		main("Hi", "Bye"); // Compile time Polymorphism
​
		int[] arr = { 2, 6, 4, 9 };
		main(arr);
​
	}
​

