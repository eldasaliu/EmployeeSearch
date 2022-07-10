package com.neotech.Lesson28;

public abstract class Insurance {
//Homework 3:
//    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. 
//    Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. 
//    Create 3 objects of the sub classes and store them in ArrayList. 
//    Using for loop/advanced for loop/ iterator access all methods of the class.

	String InsuranceName;

	Insurance(String InsuranceName) {
		this.InsuranceName = InsuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Cars extends Insurance {
	String carModel;

	Cars(String carModel, String InsuranceName) {
		super(InsuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println("Get quote insurance for " + carModel + " car");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the insurance any time ");
	}

}

class Pet extends Insurance {
	String petType;

	Pet(String petType, String InsuranceName) {
		super(InsuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println("Get a quote insurance for your " + petType);
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the pet insurance any time ");
	}

}

class Health extends Insurance {

	Health(String InsuranceName) {
		super(InsuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Get a health quote insurance ");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel the health insurance any time ");

	}

}