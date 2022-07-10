package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of cars : American, German, Korean, Italian.
		// Then retrieve all values from that array using 2 different loops

		String[][] cars = { { "MB", "Tesla", "BMW" }, { "Audi", "mercedes", "WV", "Toyota" },
				{ "Lexus", "Kia", "Subaru" }, { "Fiat", "Lambo" }

		};
		// using index for loop
		for (int row = 0; row < cars.length; row++) {

			for (int col = 0; col < cars.length; col++) {

				System.out.println(cars[row][col] +"  ");
			}

		}
		// using for each
		for (String[] row : cars) {

			for (String car : row) {
				System.out.println(car + "  ");
			}
		}

		// what if we want to print only American cars
		for (int us = 0; us < cars[0].length; us++) {
			System.out.println(cars[0][us] + "  ");
		}
	}

}
