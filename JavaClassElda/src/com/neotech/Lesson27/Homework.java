package com.neotech.Lesson27;

import java.util.ArrayList;

public class Homework {
	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<String>();

		students.add("Liam");
		students.add("Elda");
		students.add("Ben");
		students.add("Drini");
		students.add("Mario");

		System.out.println("The student name is " + students.isEmpty());
		System.out.println("Mario is on the Dean list " + students.contains("Mario"));
		System.out.println("The size of the ArrayList: " + students.size());

		// enhanced for loop
		for (String s : students) {
			System.out.print(s + " , ");

		} // for loop
		System.out.println();
		System.out.println("===============");
		for (int i = 0; i < students.size(); i++) {

			System.out.print(students.get(i) + " , ");
		}
	}

}
