package com.neotech.Lesson17;

public class Homework5Lesson17 {



	public static void main(String[] args) {
		// Homework 5:
		// You have a String a = “Is it saturday? Is it raining? Do we have
		// a Java Class today?” How would you find out how many
		// sentences are in that String?

		String a = "Is it saturday?Is it raining?Do we have Java class today?";
		String[] b = a.split("[?]");

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i] + " ");
		}

		System.out.println("We have " + b.length + " sententce in the String");

		System.out.print(" ");

	}

}
