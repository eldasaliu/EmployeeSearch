package com.neotech.Lesson26;

//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. 
//Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
//Test your code.
public interface Shape {

	double pi = 3.14;
	int r = 6;
	int a = 8;

	void calculateArea();

	void calculatePerimeter();

}

class Circle implements Shape {

	@Override
	public void calculateArea() {
		System.out.println("pi*(r*r)");
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("2pir");
	}

}

class Square implements Shape {

	@Override
	public void calculateArea() {
		System.out.println(a * a);
	}

	@Override
	public void calculatePerimeter() {
		System.out.println(4 * a);
	}

}