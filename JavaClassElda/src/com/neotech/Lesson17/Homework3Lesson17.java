package com.neotech.Lesson17;

public class Homework3Lesson17 {

	public static void main(String[] args) {
		// Homework 3:
		// Find out how many alpha characters are present in a String?
		// Find number of words in string?

		String sentence = "We are learning Java methods";

		String b = sentence.replaceAll("[^A-Z^a-z]", "");

		System.out.println("There are " + b.length() + " alpha characters");

		System.out.println();

		String[] result = sentence.split(" ");

		for (String a : result)
			System.out.print(a + "|");
		System.out.println();
		System.out.println("The number of words in a string ---> " + result.length);
	}

}
