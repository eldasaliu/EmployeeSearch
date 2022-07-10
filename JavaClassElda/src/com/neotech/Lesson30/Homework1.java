package com.neotech.Lesson30;

import java.util.LinkedHashMap;
import java.util.Map;

public class Homework1 {
	public static void main(String[] args) {

//	Create a map of car models that you have in your garage and for each model the number of car you have.
//	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
//	For example:
//	"BMW" -> 2
//	"Mercedes" -> 3
//	"Audi" -> 3
//	"Ferrari" -> 1
//
//	- Check how many entries you have.
//	- Update the number of Audis to 5.
//	- Add a new model with any number of cars.
//	- Check how many Ferraris you have.
//	- Check if you have Honda in your map.
//	- Remove Mercedes from the map.
//	- Get all models from the map. (use keySet() method)
//
//	Note: After each step print the map.

		Map<String, Integer> car = new LinkedHashMap<>();
		car.put("BMW", 2);
		car.put("Mercedes", 3);
		car.put("Audi", 3);
		car.put("Ferrari", 1);

		System.out.println(car);
		System.out.println("How many entries we have?");
		System.out.println(car.size());
		car.replace("Audi", 5);
		System.out.println(car);
		System.out.println("Add new model of a car");
		car.put("Tesla", 7);
		System.out.println(car);
		System.out.println("How many Ferraris");
		System.out.println(car.get("Ferrari"));
		System.out.println("Do we have Honda in our map");
		System.out.println(car.containsKey("Honda"));
		System.out.println("Remove Mercedes from your map");
		car.remove("Mercedes");
		System.out.println(car);
		System.out.println(car.keySet());

	}
}