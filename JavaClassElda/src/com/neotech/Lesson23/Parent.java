package com.neotech.Lesson23;

public class Parent {
Parent(){
	System.out.println("Parent Class Cosntructor");
	
}
private void hello() {//are not inherited we cannot override them
	System.out.println("Hello from the parent Class");
	
	
	
}
//redeclaring static method but not overriding
static void bye() {
	System.out.println("Bye from the Parent Class");
	
}
class Child extends Parent{//hello we cant call from the child because is private
	Child(){
		System.out.println("Child Class Constructor");
		
	}//we are not overriding in this case because we dont have accsess 
		//to the private methods of the parent classs
		//here we are just creating a private method
	private void hello() {
		System.out.println("Hello from the child class");
	}
	static void bye () {
		System.out.println();
	}
}
}
