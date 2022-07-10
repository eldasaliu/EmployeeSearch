package com.neotech.lesson11;

public class Homework2Lesson11 {

	public static void main(String[] args) {
		// Create a 2D array that first row will contain 4 names and second row will
		// contain grades, all Strings.
		// Then you program should print name of the students that has A and B grade
		String[][] names = { { "Elda", "Jenn", "Ben", "Jason" },
				             { "A", "B", "C", "F" } };

		for (int i = 0; i < names[1].length; i++) {
			if (names[1][i].equals("A") || names[1][i].equals("B"))

				System.out.println(names[0][i] + " " + names[1][i]);
		}

	}

}
