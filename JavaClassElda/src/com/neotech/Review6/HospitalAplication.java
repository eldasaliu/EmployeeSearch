package com.neotech.Review6;

public class HospitalAplication {
public static void main(String[] args) {
	Doctor d1=new Doctor("Farhkad",180000,"D1234");
	d1.checkUp("Fahri");
	Dermatologist d2 =new Dermatologist();
	d2.name="Sherzod";
	d2.salary=300000;
	d2.dermId="D7654";
	
	d2.checkUp("Komron");
	d2.applySkinTreatment();
	System.out.println("------");
	//creating a dermatologist with initial information
	
	Dermatologist d3=new Dermatologist ("Ceyda",250000,"5555");
	d3.dermId="Q34535";
	d3.applySkinTreatment();
	
	
	
	//creating a dermatologist with 4 parameters

Dermatologist d4=new Dermatologist("Aziza",375000,"D923","ZWS") ;

d4.checkUp("Fahri");

d4.applySkinTreatment();2

		}
}
