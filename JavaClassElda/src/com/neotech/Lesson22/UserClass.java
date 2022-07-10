package com.neotech.Lesson22;

public class UserClass {
//	Homework 4:
//	    Write program: UserClass that has a constructor that
//	    initializes instance variable name and mobile number.
//	    Create a subclass UserInfo that will have user address
//	    variable and it also being initialized through constructor
//	    call. Print users name, mobile number and address in
//	    userDetails method. Test your code.

	String name;
	String mobileNumber;

	UserClass() {
		System.out.println("My info");

	}

	UserClass(String name, String mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;

	}
}

class UserInfo extends UserClass {
	String userAddress;

	UserInfo(String name, String mobileNumber, String userAddress) {
		super(name, mobileNumber);//we can call the super constroctor only once and always inT the beggining not for example after this.userAddress
		this.userAddress = userAddress;
	}

	void userDetails() {
		System.out.println("My information : " + name + "," + " mobileNumber " + mobileNumber + ","
				+ " also my address " + userAddress);
	}
}
