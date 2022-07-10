package com.neotech.Lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		
	
ArrayList<String> choco =new ArrayList<>();
choco.add("Kinder");
choco.add("Hershey");
choco.add("Godiva");
choco.add("Tobleron");

ArrayList<String>sweets =new ArrayList<>();
sweets.add("Ice cream");
sweets.add("Tiramisu");
sweets.add("Pinaple cookie");
sweets.add("Carrot cake");
//Adds all the elements of choco to the sweets ArrayList
	sweets.addAll(choco);
	System.out.println("The size of sweets is "+ sweets.size());
	System.out.println(sweets);
	
	//we want to use iterator //this is better way to use it
	//Iterator for string object to iterate the sweets ArrayList
	Iterator<String> it=sweets.iterator();
	//1 Direction
	while(it.hasNext()) {
		String element=it.next();
		System.out.print(element+" - ");
		
		if (element.equals("Carrot Cake")) {
			it.remove();
			
		}
		
	}
	System.out.println();
	System.out.println(sweets);//Printong the list after removing"Carrot cake"
	
	//enhanced for loop
	//1Directaion
	for(String str:sweets) {
		System.out.print(str+" - ");
		
	}
	//Normal for loop
	//iterating from the last object to the first
	
	for(int i=sweets.size()-1;i>=0;i--) {
		System.out.print(sweets.get(i)+" - ");
	}
	System.out.println();
	}
}