package com.neotech.Review7;

public class World {

	public static void main(String[] args) {
		//I cannot create an object 
		Human a1=new Albania("Elda");//up casting 
		a1.talk();
		a1.sleep();
		//a1.albaniaDance();
		
		Turkish t1= new Turkish("Brian");//Up casting
		t1.talk();
		t1.sleep();
		
		Turkishh turkishh =(Turkishh) t1;//Down casting
		turkishh.makeBakllava();
		
		
		
		// Task until 2:37
		// Create an array of 5 Humans, and fill it.
		// Iterate the array with an enhanced for loop
		// execute the talk and sleep method for all of them
		
		Human t2=new Human("Mai");
		Human t3=new American("John");
		
	}

}
