package com.neotech.lesson13ReviewExamples;

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {
		int[][] nums = { 
				{ 6, 3, 7 }, 
				{ 2, 4, 9 }, 
				{ 1, 5, 0 }, 
				{ 8, 6, 2 } 
		};
​
		System.out.println(nums[1][2]);
		System.out.println(nums[3][0]);
		System.out.println(nums[2][1]);
​
		System.out.println(nums[0][0]); // 6
		System.out.println(nums[3][1]); // 6
​
		System.out.println("----------------");
		// Nested Enhanced for loop
		for (int[] row : nums) {
​
			// I will iterate the row (1D-Array) with an enhanced for loop
​
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
​
}