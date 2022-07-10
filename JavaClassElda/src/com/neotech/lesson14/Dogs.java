package com.neotech.lesson14;

public class Dogs {

	public static void main(String[] args) {

		// create object using the Dog class
		Dog dog1 = new Dog();

		dog1.breed = "Akita";
		dog1.size = "small";
		dog1.color = "Brown";
		dog1.age = 13;

		dog1.sniff();
		dog1.bark();

		Dog dog2 = new Dog();

		dog2.breed = "Shepherd";
		dog2.size = "Big";
		dog2.color = "black";
		dog2.age = 5;

		dog2.sniff();
		dog2.bark();

		Dog dog3 = new Dog();
		dog3.breed = "Dacshund ";
		dog3.size = "Medium ";
		dog3.color = "Black ";
		dog3.age = 7;

		dog3.sniff();
		dog3.bark();

	}

}
