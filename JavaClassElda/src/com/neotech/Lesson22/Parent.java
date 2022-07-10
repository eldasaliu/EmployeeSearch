package com.neotech.Lesson22;

public class Parent {
String name="Parent Name";
String lastName="Parent LastName";
void hello() {
	System.out.println("Iam the parent class");
}//the rule is that only one can be public we can create ony class
class Child extends Parent{
	public String name="Child Name";
	void display() {
		System.out.println(name);
		//2nd way 
		System.out.println(this.name);//with thiis name i print the current class
		//when i want to print the name of the parent we use "super"
		System.out.println( super.name);
		//if i want to print the LastName
		System.out.println(super.lastName);
		//but even if we do it without super it will print because it is just one last name
		System.out.println(lastName);
		//another way is with this.name
		
	}
	void hello() {
		System.out.println("I am the child class");
	}
	void sayHello() {
		display();//Java add this keyword in front of the method
	super.hello();//or just hello because is no other hello if it waas we had to use super.hello
}
}
	
}