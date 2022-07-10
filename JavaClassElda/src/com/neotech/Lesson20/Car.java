package com.neotech.Lesson20;

public class Car {
	String make,model;
	int year;
	//non-argument constructor
	Car(){
		System.out.println( "Iam a default constructor");
		
	}
	//parametric constructor
	Car(String carMake,String carModel,int carYear)
{
		System.out.println("Ia m creating an object with parameters");
		make=carMake;
		model=carModel;
		year=carYear;
		}
	public void printDetails() {
		System.out.println("I have a " + year + " " + make + " " + model + " and it is great!");
}
}