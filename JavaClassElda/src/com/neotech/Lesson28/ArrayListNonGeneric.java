package com.neotech.Lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {
	public static void main(String[] args) {
		
	
//Generic ArrayList
	ArrayList<Double> al=new ArrayList<Double>();
	
	al.add(12.8);
	al.add(2.45);
	al.add(10.99);
	//al.add("Two");//CE
	//al.add(100);//ce,integer is not automaticlly converted to adouble
	System.out.println(al);
	
	al.set(1, 15.5);//replacing an element in the ArrayList
	//if index is larger than the size of the list the we have compil error 
	//Exception in thread "main" java.lang.IndexOutOfBoundsException: so when we try to put(3,15.5)
	System.out.println(al);
	
	//remove an element from the list
	al.remove(2);//or remove the element with index 0//printing the list again
	System.out.println(al);
	
	System.out.println("Get the element with index 0 : " +al.get(0));
	
	//for loop
	for (int i=0;i<al.size();i++){

	//for arrays we used arr[i]
	System.out.print(al.get(i) + "- ");
	
	//for each loop
	for(Double d:al) {//auto boxing and auto unboxing can be done by java itself
		//so we can use Double d or double d
		System.out.print(d + " - ");
		
		
		System.out.println("================");
		
		//generic ArrayList
		//ArayList<Double>al=new ArrayList<>();
		//Non Generic ArrayList
		ArrayList<Object> al2=new ArrayList<>();
		al2.add("Hello");//storing a string object
		al2.add(100);//storing an integer object
		al2.add('A');////storing a characte
		al2.add(al);//storing a ArrayList object
		
		System.out.println(al2);
		//retrieving all the elements from the non generic ArrayList
		for(Object obj:al2) {       //when you dont specify an object is non generic
			System.out.println(obj);
		}
		
	
	
	}
 
	
	}
}
}