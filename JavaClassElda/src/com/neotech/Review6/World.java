package com.neotech.Review6;

public class World {
public static void main(String[] args) {
	//1 st way using constructor with no parametrs
	Person p1=new Person();
	p1.displayInfo();
	
	p1.name="Sema";
	p1.age=20;
	p1.weight=100;
	p1.displayInfo();
	System.out.println();
	//2 nd way
	Person p2=new Person("Mustafa",250);
	p2.displayInfo();
	p2.age=45;
	p2.displayInfo();
	System.out.println();
	//3 thd way
	Person p3=new Person("Brikenda");
	p3.displayInfo();
	
}
}
