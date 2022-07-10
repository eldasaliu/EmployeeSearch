package com.neotech.Lesson28;

import java.util.ArrayList;
import java.util.ListIterator;

public class Homework1 {
//	Homework 1:
//	    Create an arrayList of drinks. 
//	    If any drink has letter “a” or “e” replace it with water.
//
	public static <Drink> void main(String[] args) {
		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("Raki");
		drinks.add("Tom Collins");
		drinks.add("Wine");
		drinks.add("Mojito");

		System.out.println(drinks);
		ListIterator<String> iter = drinks.listIterator();
		while (iter.hasNext()) {
			String drink = iter.next();
			if (drink.contains("a") || drink.contains("e")) {
				iter.set("Water");
			}

		}
		System.out.println(drinks);
		
		//Using ReplaceAll

	}//if(str.contains("a")|| str.contains("e")
	{
		//str=str.replaceAll(str,"water");
	}
	//syso(str +"");
	//syso(drinks)
	}
//using an index for loop
//for(int i=0;i<drinks.size();i++) {
//	if (drinks.get(i).contains("a")||drinks.get(i).contains("e")) {

//		drinks.set(i,"water");
//	}
//	syso(drinks);
//}

