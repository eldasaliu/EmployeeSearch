package com.neotech.Lesson26;

public class DoctorTest {

	public static void main(String[] args) {
Doctor doc=new Doctor();
doc.setEmail("");
System.out.println(doc.getEmail());//what does this print

doc.setEmail("doctor@yahoo.com");
System.out.println(doc.getEmail());//whar does it print?

doc.setEmail("doctor@gmail.com");
System.out.println(doc.getEmail());
		
	}

}
