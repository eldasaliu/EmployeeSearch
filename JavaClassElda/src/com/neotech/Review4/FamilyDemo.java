package com.neotech.Review4;

public class FamilyDemo {

	public static void main(String[] args) {


			// I CANNOT access instance variables before I create an object
			// FamilyMember.firstName = "LeBron";
	​
			// I CAN access class/static variables before I create an object
			FamilyMember.lastName = "James";
	​
			// I CANNOT access non-static methods before I create an object
			// FamilyMember.printFullName();
	​
			// I CAN access static methods before I create an object
			FamilyMember.printFamilyName();
	​
			System.out.println("--------------------------------");
			FamilyMember member1 = new FamilyMember();
			member1.firstName = "LeBron";
			member1.age = 36;
	​
			FamilyMember member2 = new FamilyMember();
			member2.firstName = "Savannah";
			member2.age = 34;
	​
			member1.printFullName();
			member2.printFullName();
			System.out.println("--------------------------------");
	​
			System.out.println("They went to the court and changed their lastname!!!");
	​
			// Static variables CAN change!!!
			FamilyMember.lastName = "Smith";
	​
			member1.firstName = "King LeBron";
	​
			member1.printFullName();
			member2.printFullName();
	​
			// They had a baby
			FamilyMember baby = new FamilyMember();
	​
			// Does this baby has a firstName?
			System.out.println("firstName-> " + baby.firstName);
	​
			// Does this baby has a lastName?
			System.out.println("lastName-> " + FamilyMember.lastName);
	​
		}
	​
	

	


