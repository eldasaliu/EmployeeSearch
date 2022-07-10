package com.neotech.Lesson22;

public class CalculateArea {
//	Task 3:
//	Create a class named CalculateArea in which you should create three methods (with the same name )that will calculate the area (volume) of  
//	* Rectangle
//	* Square 
//	* Box
//
//	For Rectangle give 2 sides
//	For Square give 1 side
//	For Box give 3 sides
//
//	Use a separate class to test your code
​
	static void area(int side1, int side2) {
		System.out.println("The area of the Rectangle is -> " + side1 * side2);
	}
​
	static void area(int side) {
		System.out.println("The area of the Square is -> " + side * side);
	}
​
	static void area(int length, int width, int height) {
		// For Math teacher
		// 2*length*width + 2*length*height + 2*width*height
		System.out.println("The area of the Box is -> " + length * width * height);
	}
​
}
}
