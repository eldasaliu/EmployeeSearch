package com.neotech.Lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {

	public static void main(String[] args) {
//		Create a map of countries with its capital that will store countries in alphabetical order.
//		Add them randomly in the map.
//		Example:
//		    "France" -> "Paris"
//		    "Kosovo" -> "Prishtina"
//		    "Turkey" -> "Ankara"
//		    "USA" -> "Washington DC"
//		    "Albania" -> "Tirana"
//		    "Italy" -> "Rome"
//
//		    - Print the list and check the order of the countries.
//		    - Verify if you have your contry (Albania, Turkey) in the list ( use containsKey() method )
//		    - Verify if a specific capital city is in the list ( use containsValue() method )
//		    - Get all the keys (countries names) in a Set. Print all country names using for each loop.
//		    - Get all the values (capital names) in a Collection. Print all capital names using iterator.

		Map<String, String> countries = new TreeMap<>();

		countries.put("France", "Paris");
		countries.put("Kosovo", "Prishtina");
		countries.put("Turkey", "Ankara");
		countries.put("USA", "Washington DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");

		System.out.println("Print the list");
		System.out.println(countries);
		System.out.println("Do we have Albania?");
		System.out.println(countries.containsKey("Albania"));
		System.out.println("Do we have Turkey?");
		System.out.println(countries.containsKey("Turkey"));

		System.out.println("Is Tirana on the list?");
		System.out.println(countries.containsValue("Tirana"));

		Set<String> capitals = countries.keySet();
		for (String c : capitals) {
			System.out.print(c + ",");
		}
		System.out.println();

		Collection<String> capital = countries.values();
		Iterator<String> it = capital.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ", ");
		}
	}
}