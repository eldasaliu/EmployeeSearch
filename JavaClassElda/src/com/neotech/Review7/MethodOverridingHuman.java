package com.neotech.Review7;
//Every class by default extends the object class
public class MethodOverridingHuman {
	
	//fields/variables
String name;//instance variable
static String planet;//class variable

public MethodOverridingHuman() {
	//we are calling super()
	System.out.println("A human is being created");
	
}
public  MethodOverridingHuman (String name) {
	//super();//calls thee parent constractor
	this();//we cannot put this one after this.name=name always in the begining
	this.name=name;
}

//behavior/method
public void talk() {
	System.out.println("bla bla bla");
}
}
