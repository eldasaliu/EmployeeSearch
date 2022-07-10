package com.neotech.Review7 ;

public abstract class Human {
	String name;//instance variable
	static String planet;//class variable

	
	public  Human (String name) {
		//super();//calls thee parent constractor
		//we cannot put this one after this.name=name always in the begining
		this.name=name;
}
	public abstract void talk();//uniplemented method
	public void sleep() {
		System.out.println("All humans sleep");//implemented method,has a method body
	}
}