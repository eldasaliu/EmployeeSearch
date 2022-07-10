package com.neotech.Lesson18;

public class DogShelter {

	public static void main(String[] args) {
		//How to access instance variables?
		//By creating an object and using the reference value
		Dog dog1=new Dog();
		dog1.name="Melo";
		dog1.age=2;
		dog1.age=3;
		dog1.displayDogInfo();
		
		//How to access static variables?
		//we can access by using class name
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		
		System.out.println(dog1.name);
		//to access instance variables,we have to use the reference variable
		System.out.println(dog1.name);
		
		Dog dog2=new Dog();
		dog2.name="Cufo";
		dog2.age=6;
		dog2.displayDogInfo();
		
		System.out.println("================");
		Dog.breed="Shepherd";
		dog1.displayDogInfo();
		dog2.displayDogInfo();
		
		Dog dog3=new Dog();
		dog3.name="Kujo";
		dog3.age = 1;
		dog3.displayDogInfo();

	}

}
