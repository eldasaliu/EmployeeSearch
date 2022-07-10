package com.neotech.Lesson28;

public class Car {
String make,model;
int year;

public Car(String make,String model,int year){
	this.make=make;
	this.model=model;
	this.year=year;
	
}
public void printInfo() {
	System.out.println(make+ " , " +model+" , "+year);
}
}
