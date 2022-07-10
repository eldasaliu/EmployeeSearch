package com.neotech.Review8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;//Import all the classes under java.util pacage

public class CollectionIntro {

	public static void main(String[] args) {
		// List<String>africa=new List<>();
///List is an inteface we cannot create and object
		List<String> africa = new ArrayList<>();// Up casting
		africa.add("Wakanda");
		africa.add("Senegal");
		africa.add("Kenya");
		africa.add("Egypt");// Addind ito the list with an index
		africa.add(2, "Maroco");
		System.out.println(africa);

		// 1st way of copying all the element into a new list
		List<String> africa2 = new ArrayList<>(africa);// we can get it from the africa1
		// I created a filled list
		System.out.println(africa2);

		// 2nd way
		List<String> africa3 = new ArrayList<>();
		africa3.addAll(africa);
		System.out.println(africa3);

		// 3d way ,iterating the first list and adding elements into the new list
		System.out.println("===============");
		// iterate africa in 3 different ways

		// for loop
		for (int i = 0; i < africa.size(); i++) {
			String country = africa.get(i);// string we are getting
			System.out.print(country + " ");

		}
		System.out.println();
		for (String country : africa) {
			System.out.print(country + " ");

		}
		System.out.println();
		System.out.println("Using Iterator example the 3d way");
		Iterator<String> it = africa.iterator();
		
while(iterator.hasNext()) {
String country=iterator.next();
		System.out.println(country +" ");
}
ArrayList europe=new ArrayList();//Non Generic
europe.add("France");
europe.add(7);
europe.add(true);
europe.add(3.6);

for(Object element:europe) {
	System.out.println(element);//I can ctore diffrent data type this is called Object
}
System.out.println("===================");

List<String> asia=new LinkedList<>();//Up casting
asia.add("Turkey");
asia.add("India");
asia.add("Taiwan");
asia.add(0,"Iran");//if we want to put Iran in the first list we put(0,Iran)
asia.add("Turkey");
asia.add("Taiwan");
System.out.println(asia);
}
}
