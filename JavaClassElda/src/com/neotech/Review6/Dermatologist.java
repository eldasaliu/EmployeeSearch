package com.neotech.Review6;

public class Dermatologist extends Doctor {
	
	String dermId;
	
	public Dermatologist() {
	//super();
	//implicity is  calling the default constructor of the parent
			
	//The constructor are not inherited	
}
	public Dermatologist  (String name,int salary,String licenseId) {
		super(name,salary,licenseId);
		//super.name=name;
		//super.salary=salary;
		//super.licenseId=licenseId;
		this.dermId=dermId;
	}
	public void applySkinTreatment() {
		System.out.println("Doctor"+ this.name +"applies skin treatment");
	}
}
