package com.neotech.Lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> breakfast=new HashSet<>();
		//no dublicates ,no order but java is case sensiive and Tea is allowed twice couse its upercase
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("cheese");
		breakfast.add("burek");
		breakfast.add("tea");
		breakfast.add("Tea");
		breakfast.add("burek");
		
		Iterator<String> size=breakfast.iterator();
		System.out.println("The size of the set is"+ size);
		//retrive all elemnts using iterator
		
		Iterator<String> it=breakfast.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
			
			System.out.println("===============");
			//retrive all element using for each loop
			for(String item:breakfast) {
				System.out.println(item +" ");
			}
			System.out.println();
		}
		
	
	}

}
