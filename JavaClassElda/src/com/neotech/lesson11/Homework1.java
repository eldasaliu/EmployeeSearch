package com.neotech.lesson11;

public class Homework1 {

	public static void main(String[] args) {
		// Create an array of countries: north America countries,
		// south America countries, Europe countries, Asian countries,
		// African countries. Then print all values from that array using 2 different
		// loops
		// and calculate how many total countries been stored.

		String[][] countries = { { "Bahamas", "US", "Canada" }, { "Argentina", "Brazil", "Colombia" },
				{ "Albania", "Italy", "France" }, { "China", "Azerbaijan" },
				{ "Algeria", "Angola", "Benin", "Ethiopia" } };

		System.out.println("Uing For loop");

		System.out.println();

		int count = 0;
		for (int rows = 0; rows < countries.length; rows++) {
			for (int cols = 0; cols < countries[rows].length; cols++) {

				System.out.print(countries[rows][cols] + ", ");

			}
			count += countries[rows].length;
			
		}
		System.out.println("Total countries are :" + count);
		


		System.out.println("Using enhanced loop");

		System.out.println();

		for (String[] row : countries) {
			for (String col : row) {
				System.out.print(col + ", ");

			}
		}

	}

}
