package com.neotech.Lesson26;

public class RegistrationTest {
	public static void main(String[] args) {
		Registration r = new Registration();
		r.setEmail("eldasaliu@gmail.com");
		System.out.println(r.getEmail());
		r.setEmail("eldasaliu@yahoo.com");
		System.out.println(r.getEmail());
		r.setUserName("Saliu");
		System.out.println(r.getUserName());

		r.setUserName("eldasaliu");
		System.out.println(r.getUserName());
		r.setPasword("Hi1");
		System.out.println(r.getPasword());
		r.setPasword("Elda123");
		System.out.println(r.getPasword());
	}
}
