package com.neotech.lesson15;

public class Email {
//Create a method createEmail(). Based on provided users firstName, lastName and emailType, your method should return complete email address.
//		Example: 
//			firstName -> john
//			lastName -> snow
//			emailType -> gmail
//			return -> johnsnow@gmail.com

	String firstName, lastName, emailType;

	void createEmail() {
		System.out.println(firstName + lastName + "@" + emailType + ".com");

	}

	public static void main(String[] args) {

		Email a = new Email();

		a.firstName = "elda";
		a.lastName = "saliu";
		a.emailType = "gmail";

		a.createEmail();

		System.out.println("===================");
	}
}
