package com.neotech.Lesson23;

public class Animal {
public void eat () {
	System.out.println("All animals eat");
	
}
public void sleep() {
	System.out.println("All animals sleep0");
	
}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("Tigers eat humans");
		
		
	}
	public void run () {
		System.out.println("Tigers run fast");
		
	}
}