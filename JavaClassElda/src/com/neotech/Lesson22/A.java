package com.neotech.Lesson22;

public class A {
//	Write program for multilevel inheritance where class A 
//	is inherited by B and class B is inherited by class by C.
//
//	All three classes have a (String name) variable and a method()
//	Inside the methods print this.name and super.name and call super.method()
​
	String name = "A";
​
	void method() {
		System.out.println("This is a method in class A!");
		System.out.println(name);
		// System.out.println(super.name);
		// super.method();
	}
}
​
class B extends A {
	String name = "B";
​
	void method() {
		System.out.println("This is a method in class B!");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	}
}
​
class C extends B {
	String name = "C";
​
	void method() {
		System.out.println("This is a method in class C!");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	}
}

