package com.neotech.lesson13;

public class HomeWork2 {

	public static void main(String[] args) {
		int[] numbers = { 8, 78, 7, 15 };

		int firstlargest = numbers[0];
		int secondLargest = numbers[0];
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > firstlargest) {
				secondLargest = firstlargest;
				firstlargest = numbers[i];
			} else if (numbers[i] > secondLargest) {
				secondLargest = numbers[i];

				if (numbers[i] < min) {
					min = firstlargest;

				}
			}

		}

		System.out.println("First largest number is : " + firstlargest );
	System.out.println("Secondlargest number is : " + secondLargest);
		System.out.println("The Min number is : " + min);
	}

}
