package com.neotech.Lesson31;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HomeWork1 {

	public static void main(String[] args) {
//		Homework 1:
////			   Create a Map that will store Employee name and salary. 
//		Write a logic to retrieve an employee who gets the highest salary. 
//		Output should be in the below format
////				- John Smith=$100000

		Map<String, Integer> emp = new TreeMap<>();
		emp.put("Elda", 160000);
		emp.put("John ", 50000);
		emp.put("Andrea", 90000);
		emp.put("Liam", 30000);
		System.out.println(emp);
		int largest = 0;
		String name = "";
		for (Entry<String, Integer> entry : emp.entrySet()) {

			if (entry.getValue() > largest) {

				name = entry.getKey();
				largest = entry.getValue();
			}
		}
		System.out.println("Eemployee who gets the highest salary : ");
		System.out.println(name + " = $" + largest);

	}

}
