package com.neotech.Lesson21;

public class Animal {
String size,color;
public int age;
public void sleep() {
	System.out.println("All animalas sleep");
}
public void eat() {
	System.out.println("All animals eat");
}
public void displayInfo(){
	System.out.println(size + "," + color +", age->"+ age);
}
}
