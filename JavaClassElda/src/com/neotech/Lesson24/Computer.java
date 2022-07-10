package com.neotech.Lesson24;

public class Computer {
String brand;
Computer(String brand){
	

//by not using a default constructor we force users to enter the brand 
//when thhey try to create an object
this.brand = brand;

}//override run()
public void run() {
	System.out.println(brand+" can run a sytem");
}
public void safe() {
	System.out.println(brand+"is very safe");
}

class Apple extends Computer{
	Apple (String brand){
		super(brand);
		
	}
}
class Lenovo extends Computer {
	String color;
	Lenovo(String brand,String color){
		super(brand);
		this.color=color;
	}

	public void run() {
		System.out.println(brand+ "runs the system faster");
	}
	public void save() {
		System.out.println(brand +"saves a lot of data");
	}
}
class HP extends Computer{
	HP(String brand){
		super(brand);
	}
	//override
	public void run() {
		System.out.println(brand+ "run fast ennough");
	}
	
	public void storage() {
		System.out.println(brand+"has a lot of storage ");
	}
}

class Dell extends Computer{
	
Dell(String brand){
	super(brand);
	
}//lets not override here
public void storage() {
	System.out.println(brand+"does not have a lot of storage");
}
}
}