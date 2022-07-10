package com.neotech.lesson11;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades= {'A','B','C','D' ,'F'};
		//1st way ,using for loop
		
		for(int i=0; i<=grades.length-1;i++) {
			
			
			
			
			System.out.print(grades[i]+", ");
			
		}
		//2 nd way,enhanced for loop/ advanced for loop/for each loop
System.out.println();
for (char element: grades) {
	System.out.print(element + " ,");
}
System.out.println();



System.out.println("-----");

String[] fruits = {"Apple","Orange" ,"Cucumber", "Cherry" };
for (int i=0; i<fruits.length; i++) {
	if (fruits[i].equals("Cucumber")) {
		System.out.println(fruits[i] + "is my favorite fruit");
		
		
	}else {
		System.out.println(fruits[i]);
		
	System.out.println(fruits[i]);
	
}
System.out.println("_____");


for (String fruit : fruits) {
	if (fruit.equals("Cucumber")) {
		System.out.println(fruits[i] + "is my favorite fruit");
		
	}else {
		System.out.println(fruits[i]);
	}
		
	System.out.println(fruit);
}
}
	}
}
	