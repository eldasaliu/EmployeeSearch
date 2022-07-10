package com.neotech.Review6;

public class Person {
//instance variables
	public String name;
	int age;
	protected int weight;
	
	Person(){//we have to have a default contractor to not have problem on the Console
		System.out.println("Creating a person");
	}
	Person(String pName,int pWeight){
		name=pName;
		weight=pWeight;
		
		}
	Person(String pName,int pWeight, int pAge){
		this(pName,pWeight);
		age=pAge;
	}
	public void displayInfo() {
		System.out.println("Name :"+name+"age" +age+"weight"+ weight);
		
	}
	
}
