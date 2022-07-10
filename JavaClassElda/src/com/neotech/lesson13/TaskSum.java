package com.neotech.lesson13;

public class TaskSum {

	public static void main(String[] args) {//using index for loop

//		Create a 2D array of integer type and store numbers in 3 rows 
//		and 3 columns. Print the sum of all numbers.

		int[][] num = { { 3, 5, 15 }, { 4, 6, 12 }, { 4, 5, 8 } };

		int sum = 0;

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				// num[row][col]
//				sum = sum + num[row][col];
				// shorthand op
				sum += num[row][col];

			}
		}

		System.out.println("The total sum is: " + sum);

		int sum2 = 0;

		for (int[] row : num) {
			for (int value : row) {
//				sum2 = sum + value; 
				sum2 += value;

			}
		}
		System.out.println("The total sum is: " + sum2);

	}

}