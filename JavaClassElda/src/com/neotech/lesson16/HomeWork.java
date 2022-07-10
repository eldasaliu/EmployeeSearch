package com.neotech.lesson16;

public class HomeWork {

	public static void main(String[] args) {
		// Homework 1:
		// Create a String that will hold a sentence.
		// Write a program to get a new String without any spaces.

		String str = "I have Java class tomorrow";
		String str1 = str.replace(" ", "");
		System.out.println(str1);
		System.out.println("============");

		// Homework 2:
		// Create a String that should be combination of letters,
		// numbers and special characters.
		// Find out how many alpha characters are there in the String.
		// (alpha characters means letters)

		String pass = "My password is :iLiKe&523_JavA";
		String pass1 = pass.replaceAll("[^A-Z^a-z]", "");

		System.out.println("There are " + pass1.length() + " alpha characters");

	}
}