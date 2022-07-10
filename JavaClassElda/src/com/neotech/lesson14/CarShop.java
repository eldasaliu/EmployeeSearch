package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
		//let us create some cars for our shop
		Car car1 = new Car();
		car1.make="Toyota";
		car1.model="Camry";
		car1.color="Black";
		car1.year=2019;
		car1.mileage =25000;
		car.maxSpeed =220;
		
System.out.println(car1.make + " " + car.model +" " + car1.color + " "+ car1.year +" "+ car1.mileage + " "+ car1.maxSpeed);



car1.drive();
car1.stop();
car1.transportPeople();
//create another Car project
Car car2=new Car();
car2.make="Honda";
car2.model="Acord";
car2.color="Blue";
car2.year=2020;
car2.mileage=30000;
car2.maxSpeed=250;

	
	}

}
