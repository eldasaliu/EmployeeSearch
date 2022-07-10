package com.neotech.Review8;

import java.util.Iterator;//I am doing to revie the class again for this i dint put the solution
import java.util.LinkedList;
import java.util.List;

public class Task {//Interview question

	public static void main(String[] args) {
		// Task until 2pm
		// Iterate the Asia list and remove duplicates
		// hint: you can create a new List, add the elements one by one
		// but first check if the new list CONTAINS the country
		
		List<String> asia=new LinkedList<>();//Up casting
		asia.add("Turkey");
		asia.add("India");
		asia.add("Taiwan");
		asia.add(0,"Iran");//if we want to put Iran in the first list we put(0,Iran)
		asia.add("Turkey");
		asia.add("Taiwan");
		System.out.println(asia);
		
		Iterator<String> it = asia.iterator();
		
		while(it.hasNext()) {
		String country =it.next();
		 if(asia.contains(country)) {
			asia.add(country);
 
				
	 
	}		
System.out.println(asia);					
		}
}

}
