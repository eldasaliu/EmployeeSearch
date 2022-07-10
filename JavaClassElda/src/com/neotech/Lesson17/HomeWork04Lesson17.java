package com.neotech.Lesson17;

public class HomeWork04Lesson17 {

	public static void main(String[] args) {
		// Homework 4:
		// Write a java program to reverse String? Reverse a string word
		// by word?

		String s = "The pizza smells delicious !!";
		String[] result = s.split(" ");

		System.out.println("Reverse a string word by word ---> ");
		System.out.println();

		for (String word : result) {
			char[] charArray = word.toCharArray();

			for (int i = charArray.length - 1; i >= 0; i--) {

				System.out.print(charArray[i]);

			}
			System.out.print(" ");
		}
	}
}