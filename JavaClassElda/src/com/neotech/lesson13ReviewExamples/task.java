package com.neotech.lesson13ReviewExamples;

import java.util.Scanner;

public class task {
	// Ask the user: How many numbers do you want to store in the array?
	// Ask him to enter the numbers: Read numbers and enter them into the array
	// Print the numbers from the array

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("How many numbers do you want to store in the array ?");
		int size = input.nextInt();
		// declaring the array

		int[] array = new int[size];
//read numbers and enter them into the array
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number:");
//			int num = input.nextInt();
			array[i] = input.nextInt();

		}
//print the numbers from the array
		System.out.println("Lets print the numbers from the array");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		System.out.println(sum);
	}

}
