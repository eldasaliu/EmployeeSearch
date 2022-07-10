package com.neotech.Lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class CarTest {

	public static void main(String[] args) {
 
		Car c=new Car("Honda","sport",2021);
		Car b=new Car("Mercedes","GLE",2022);
		Car d=new Car("Jeep","Wrangler",2015);
		//Storing car object in the ArrayList
		ArrayList<Car> car=new ArrayList<>();
		//or in this way 
		//cars.add(new Car("Toyata","Camry",2020);
		//cars.add(new Car("Honda",Accord",2002);
		//cars.add(new Car("Tesla","Model S",2025));
		car.add(c);
		car.add(b);
		car.add(d);
		
		Iterator<Car> C=car.iterator();
		while(C.hasNext()) {
			C.next().printInfo();
			 
		
			System.out.println();
			//Normal for loop
			//for(int i=0; i<car.size();i++){
			//car.get(i).printinfo();	
			System.out.println();
			//Enhanced for loop
			//for(Car car:car){
			//car.printInfo();
			
			
			}
		}
	}


