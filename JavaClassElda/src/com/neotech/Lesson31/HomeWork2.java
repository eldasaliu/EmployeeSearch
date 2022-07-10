package com.neotech.Lesson31;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
 

public class HomeWork2 {

	public static void main(String[] args) {
//		Homework 2:
//		    Create the collection that will store single unique objects of a String type in which order is preserved.
//		    Write a logic to concatenate(join it means) all string from the collection.

		
		Collection<String> objects=new LinkedHashSet<>();
		
		objects.add("Monday");
		objects.add("Tuesday");
		objects.add("Wednesday");
		objects.add("Thursday");
		objects.add("Friday");
		objects.add("Saturday");
		objects.add("Sunday");
		System.out.println(objects);
		
		Iterator<String> iter=objects.iterator();
		while(iter.hasNext()) {
			String obj=iter.next();
			System.out.print(obj + ",");
		}
	}

}
