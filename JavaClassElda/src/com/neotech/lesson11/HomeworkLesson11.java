package com.neotech.lesson11;

public class HomeworkLesson11 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an
		// array.
		int[] num = { 4, 5, 6, 8 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.print("The sum of all elements is : " + sum + "  ");

	}

}
