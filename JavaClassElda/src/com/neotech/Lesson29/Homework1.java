package com.neotech.Lesson29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {

	public static void main(String[] args) {
//		Homework 1:
//			   Create a Set collection in which you need to add names of the countries.
//			   In this set we want all objects to be sorted in alphabetical order. 
//			   Using 2 different ways retrieve all elements from set.

		Set<String> countries = new TreeSet<>();//in order
		//linkedHashset whatever you put there you gonna get it like that
		//HashSet no order
		countries.add("Sweden");
		countries.add("Italy");
		countries.add("France");
		countries.add("United States");
		countries.add("Albania");
		System.out.println(countries);

		// Iterator
		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " , ");
		}

		System.out.println();
		System.out.println("========= For Each Loop ==========");

		for (String country : countries) {
			System.out.print(country + " , ");

		}
		System.out.println();//there is no 3d way in a set in a set we dont have an index
		//for(int i=0;i<countries.size();i++);
		//countries.get(i);
	}
}
