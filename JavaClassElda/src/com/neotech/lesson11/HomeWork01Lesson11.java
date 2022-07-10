package com.neotech.lesson11;

public class HomeWork01Lesson11 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Print all values from
		// the array.
		String[] cars = { "Honda", "Tesla", "Bentley", "Jeep", "BMW", "Audi" };
		int size =cars.length;
		for (int c = 0; c < size; c++) {

			System.out.print(cars[c] + "  ");

		}
		System.out.println();
	}
}