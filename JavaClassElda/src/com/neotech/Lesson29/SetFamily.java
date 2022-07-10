package com.neotech.Lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
Set<String> veggies=new HashSet<>();
veggies.add("patato");
veggies.add("eggplant");
veggies.add("tomato");
veggies.add("tomato");

System.out.println(veggies);
//LinkedHashSet-no dublicate,but we have insertion order
Set<String > fruits=new LinkedHashSet<>();
fruits.add("apple");
fruits.add("bannana");
fruits.add("mango");
fruits.add("apple");

System.out.println(fruits);


//TreeSet - no dublicates,asceding order
Set <String> food=new TreeSet<>();
food.add("eggs");
food.addAll(veggies);
food.addAll(fruits);


System.out.println(food);
food.removeAll();
	}

}
