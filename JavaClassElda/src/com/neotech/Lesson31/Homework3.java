package com.neotech.Lesson31;

import java.util.ArrayList;
import java.util.Collection;

public class Homework3 {

	public static void main(String[] args) {
//		Homework 3:
//		    Create a collection of integers in which you can keep duplicates. 
//		    Write a logic to find sum of all integers
//	}

		Collection<Integer> num = new ArrayList<>();

		num.add(10);
		num.add(6);
		num.add(4);
		num.add(6);
		num.add(3);
		num.add(10);

		System.out.println(num);
		int sum = 0;
		for (Integer in : num) {
			sum += in;

		}

		System.out.println("The sum of all integers --> " + sum);
	}
}
