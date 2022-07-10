package com.neotech.Lesson22;

public class Shape {
	
	int radius;
	public Shape(int radius) {
		this.radius=radius;
		
		
	}

}
class Circle extends Shape{
	public Circle (int radius) {
		super(radius);
		
		
		
	}
	void calculateArea() {//PI is equal to 3.
		System.out.println("The area of the circle is" +3*radius*radius);
		
	}
	
}