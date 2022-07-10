package com.neotech.Lesson30;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {
	
//		Create a map of a building.
//		Store floor number and it is associated company name.
//		(Example: 1=Google, 2=Apple, 3=Neotech etc..).
//		Insert 7 entries with duplicate keys and values.
//		- Check how many entries you have?
//		- Update company on a 4th floor
//		- Remove company on the 7th floor
//		- Print your map
		
		HashMap<Integer,String> b=new HashMap<>();
		b.put(1 ,"Tesla");
		b.put(2,"Neotech");
		b.put(3,"Facebook");
		b.put(4,"Samsung");
		b.put(5,"Bank of America");
		b.put(6,"Google");
		b.put(7,"Apple");
		System.out.println(b.size());
		b.replace(4,"Kia");
		
		b.remove(7);
		System.out.println(b +" , ");
		
	}

}
