package com.neotech.Lesson26;

public class Shapetest {

	public static void main(String[] args) {
Shape sh=new Circle();
sh.calculateArea();
sh.calculatePerimeter();

Shape sh2=new Square();
sh2.calculateArea();
sh2.calculatePerimeter();


	



// if we have to do this operation in multiple different shapes
Shape[] shapes = { new Square(), new Square(), new Circle() };

for (Shape shape : shapes) {
	shape.calculateArea();
	shape.calculatePerimeter();
}
}
	
}