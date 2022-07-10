package com.neotech.Review9;

import java.util.Map;
import java.util.TreeMap;

public class StudentPassFail {
	public static void main(String[] args) {

		Map<String, Integer> studentGradeMap = new TreeMap<>();
		studentGradeMap.put("James", 95);
		studentGradeMap.put("Mary", 47);
		studentGradeMap.put("Adam", 62);
		studentGradeMap.put("Emma", 88);
		studentGradeMap.put("Steve", 50);
		studentGradeMap.put("Sophia", 100);
		studentGradeMap.put("Olivia", 65);

		System.out.println("studentGradeMap -> " + studentGradeMap);

		// Passing grade is 60
		Map<String, Integer> failingStudents = new TreeMap<>();
		Map<String, Integer> passingStudents = new TreeMap<>();

		for (String studentName : studentGradeMap.keySet()) {
			Integer score = studentGradeMap.get(studentName); // get score by using the student name

			if (score >= 60) {
				// passing
				passingStudents.put(studentName, score);
			} else {
				// failing
				failingStudents.put(studentName, score);
			}
		}

		System.out.println("Passing Student -> " + passingStudents);
		System.out.println("Failing Student -> " + failingStudents);

		// Only for good students
		// Do the same thing using EntrySet()
	}
}

}
