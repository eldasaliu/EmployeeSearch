package com.neotech.Review8;

public class PhoneDemo {

	public static void main(String[] args) {
Phone p1=new Phone("S2365","Apple","pas@345");
p1.setSerialNumber("24");
p1.displayInfo();
String serial=p1.getSerialNumber("Mustafa");
System.out.println(serial);
serial=p1.getSerialNumber("pas@345");
System.out.println(serial);

System.out.println("Iam trying to change the serial number");
p1.setSerialNumber("24");
p1.displayInfo();

p1.getSerialNumber("Br123fd");
System.out.println(p1.getSerialNumber("pas@345"));

System.out.println("   Brand  ");
String phoneBrand=p1.getBrand();
System.out.println(phoneBrand);
//I cannot change the brand
//because there is no setter 
//p1.setBrand("Samsung")
	}

}
