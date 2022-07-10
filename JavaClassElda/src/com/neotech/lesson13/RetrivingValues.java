package com.neotech.lesson13;

public class RetrivingValues {

	public static void main(String[] args) {
		String[][] animals = { { "cat", "dog", "bird" }, { "tiger", "lion", "bear" },
				{ "salmon", "seabass", "shrimps" } };
		// how do we get row numbers?
		int rows = animals.length;
		// how do we get the number of columns?
		// - we have to know, which row we are talking about
		int cols = animals[0].length; // number of cols in row 0.
		// how do we get a specific item
		String lion = animals[1][1];
		// how to print all values
		for (int row = 0; row < animals.length; row++) // go through rows
		{
			for (int col = 0; col < animals[row].length; col++) // go through cols
			{
				System.out.print(animals[row][col] + " ");
			}
		}
		System.out.println();
		System.out.println("USING FOR EACH LOOP");
		// how to get elements from 2d arrays
		for (String[] row : animals) {
			for (String col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		// using for each in 2D arrays:
		// first for loop (1D array x : 2D array)
		// second for loop (String value : 1D array)
		int[][] grades = { { 95, 86, 78 }, { 90, 92, 67, 89 }, { 77, 67, 87, 88 }, { 85, 82, 83 } };
		for (int[] row : grades) {
			for (int grade : row) {
				System.out.print(grade + " ");
			}
			System.out.println();
		}
	}
}
	}

}
