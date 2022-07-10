package com.neotech.Lesson28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	//ArrayList<String> al=new ArrayList<>();
	
	//wil ce=reate a LinkedList<> for String object
	LinkedList<String>ll=new LinkedList<>();
	ll.add("Reyhan");
	ll.add("Tuba");
	ll.add(0,"Sema");//this index 0 push others so Sema should be first on the list
	ll.add("Ceyda");
	System.out.println();
	int size=ll.size();
	System.out.println("The size of the list is :"+size);
	//getting elements from the LinkedList
	System.out.println("===============");
	//for loop
	for(int i=0;i<ll.size();i++) {
	System.out.println(ll.get(i));
}
	System.out.println("============");
	
	
	//enhanced for loop
	for(String person:ll) {
		System.out.println(person);
		
	}
	System.out.println("====================");
	
	//Iterator
	Iterator<String> it=ll.iterator();
	while(it.hasNext());
	it.next().
	
}
}