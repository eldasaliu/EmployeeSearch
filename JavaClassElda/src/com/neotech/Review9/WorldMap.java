package com.neotech.Review9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorldMap {
	public static void main(String[] args) {
		Map<String, String> europe = new TreeMap<>(); // ordered by the key
		europe.put("France", "Paris");
		europe.put("Italy", "Rome");
		europe.put("Germany", "Berlin");
		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>(); // order is preserved
		africa.put("Morocco", "Rabat");
		africa.put("Egypt", "Cairo");
		africa.put("Tunisia", "Tunis");
		System.out.println(africa);

		Map<String, String> asia = new HashMap<>(); // no order
		asia.put("China", "Beijing");
		asia.put("Vietnam", "Hanoi");
		asia.put("Iran", "Tehran");
		System.out.println(asia);

		// HW1 iterate europe by getting keys
		// HW2 iterate africa by getting values
		// HW2 iterate asia by getting entries

		System.out.println("--------WORLD--------");
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

		System.out.println("WORLD -> " + world);
		System.out.println(world.size());

		Map<String, String> map1 = world.get(1); // get element with index 1
		System.out.println("The object with index 1 is -> " + map1);

		System.out.println("--------Let us iterate the world--------");
		for (Map<String, String> continent : world) {
			// System.out.println(continent);
			Set<String> countryNames = continent.keySet();
			for (String country : countryNames) {
				System.out.println(country + " -> " + continent.get(country));
			}

			System.out.println("------");
		}

		// HW for Farkhad:
		// Do it with a nested while loop
	}

}

}
