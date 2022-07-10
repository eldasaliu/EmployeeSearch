package com.neotech.Lesson29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWork2 {
//	Homework 2:
//	    Create a Set of cities in which you want to make sure 
	// that insertion order is maintained. Using Iterator remove
	// any city that starts with “A”;
//

	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();//maintaince the insertation order/what ever order is there 
//HashSet rendom order
		//TreeSet alfabetic order
		cities.add("Alexandria");
		cities.add("Algiers");
		cities.add("Chicago");
		cities.add("Ankara");
		cities.add("Tirana");
		System.out.println(cities);
		
		Iterator<String> it = cities.iterator();

		while (it.hasNext()) {
			String city = it.next();
			if (city.startsWith("A")) {
				it.remove();

			}
		}
		System.out.println(cities);

	}

}