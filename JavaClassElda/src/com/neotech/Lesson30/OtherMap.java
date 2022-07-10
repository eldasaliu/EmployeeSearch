package com.neotech.Lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMap {

	public static void main(String[] args) {
Map<String,Integer> groceryMap=new TreeMap<>();//will order alphabetically by the KEY

groceryMap.put("Milk", 2);
groceryMap.put("Bread", 7);
groceryMap.put("Egg", 1);
//roceryMap.put(3,"Oil");//Compile error the key should be a string
groceryMap.put("Oil",3);

//My wife changed her min
groceryMap.replace("Egg", 2);
System.out.println(groceryMap);
System.out.println("          =============");
	Set<String> keys=groceryMap.keySet();
	System.out.println("keys-->" +keys);
	
	System.out.println("==============");
	Collection<Integer> values=groceryMap.values();
	System.out.println("values-->"+ values);
	
	System.out.println("==============");
	//Can we iterate the keys? yes we can
	
	for(String k:keys) {
		System.out.println(k);
	}
	//can we iterate the values? yes we can
	Iterator<Integer>valueIt=values.iterator();
	while(valueIt.hasNext()) {
		System.out.print(valueIt.next());
	}
	
	}	}