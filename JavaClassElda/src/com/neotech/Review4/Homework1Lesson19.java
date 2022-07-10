package com.neotech.Review4;

public class Homework1Lesson19 {
	// Homework 1:
	// Create a method that will accept a String as a parameter(String str)
	//and return a new
	// String that consist only of vowels.(return type->String)
	// Method should be available inside the class where it was declared and//(this means private)
	// executed by calling it is name.(static)
	public static String method(String str) {//remove everything from the string except vowels
		return str.replaceAll("[^u,a,i,e,oAEIOU]", " ");//also we can include capital letters

	}

	public static void main(String[] args) {
		String Str = "Today was such a wonderful day ";
		System.out.println("The vowels are :" + Homework1Lesson19.method(Str));

	}
}
