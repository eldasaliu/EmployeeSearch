package com.neotech.lesson11;

public class Homework3 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		String[] countries = { "Albania", "Germany", "Switzerland" };
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("Albania")) {
				System.out.println("Tirana");
			} else if (countries[i].equals("Germany")) {
				System.out.println("Berlin");

			} else if (countries[i].equals("Switzerland")) {
				System.out.println("Bern");
			}
			
		}
	}

}
