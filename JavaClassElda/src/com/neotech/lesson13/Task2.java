package com.neotech.lesson13;

public class Task2 {

	public static void main(String[] args) {//using Enhanced For
		// Create a 2D array or integer type where you will store odd and even numbers
		// in 3 rows and 4 columns.
		// Develop a program which will identify/print the even numbers only.
		int[][] num = { { 2, 3, 4, 5 },
				{ 10, 11, 12, 13 },
				{ 14, 15, 16, 17 }, };

		for (int[] row : num) {
			for (int col : row) {

				if (col % 2 == 0) {
					int total=0;
					for (int num: numbers) {
						total +=num;
						

					System.out.print(col + "  ");

				}
				
				System.out.println();
				
				
				for (int row=0;row<num.length;row++) {
					for(int col=0;col< num.length;col++) {
						if(num[row][col]%2==0)//check if number is even or odd number
							
					}
					System.out.println(num[row][col]+ "  " );
				}
			}

		}

	}
}