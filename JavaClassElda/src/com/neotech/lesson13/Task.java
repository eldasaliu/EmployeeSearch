package com.neotech.lesson13;

public class Task {

	public static void main(String[] args) {
		//Create a 2D array of integer type with 3 rows and 4 columns
		//and print all values of the whole array.

		int[][]numbers= {{ 1,2,3,4},
				       {5,7,8,9},
				       {6,4,10,12}
	                       	};
		
		for (int rows =0;rows<numbers.length;rows++) {
			
			
			for (int col=0; col<numbers[rows].length; col++) {
			
			System.out.print(numbers [rows][col] + "   ");
			
		}
		System.out.println();
	}

}
}