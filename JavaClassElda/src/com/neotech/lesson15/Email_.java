package com.neotech.lesson15;

import java.util.Scanner;

public class Email_ {

	String Email(String firstName, String lastName, String emailType) {
		String email = firstName + lastName + emailType;
		return email;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your firstName");
		String firstName = scan.next();
		System.out.println("Please enter your lastName");
		String lastName = scan.next();
		System.out.println("Please enter you emailType");
		String emailType = scan.next();

		Email_ b = new Email_();

		String emailaddress = b.Email("elda", "saliu", "@" + "gmail" + ".com");

		System.out.println(emailaddress);
	}
}
