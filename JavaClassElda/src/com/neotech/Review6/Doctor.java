package com.neotech.Review6;
//oop->Object oriented programing
//1. Inheritance means you gonna have an object with extra object(trashigimi)
//2.Polymorphism
//3.Abstraction
//4.Encapsulation
//Every class in Java is extending the objeect
//objct class is like Adam in humanity
//if we create e dermatologist class and to put all the info of the doctor we have to extend
public class Doctor {
String name;
int salary;
String licenseId;
Doctor(){
	
}
Doctor(String name,int salary,String licenseId){
	this.name=name;
	this.salary=salary;	
    this.licenseId=licenseId;
}
public void checkUp(String name) {
	System.out.println("Doctor" +this.name+"makes a checkUp"+ name);
}

}
