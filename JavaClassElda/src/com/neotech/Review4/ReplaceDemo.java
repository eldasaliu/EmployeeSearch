package com.neotech.Review4;

public class ReplaceDemo {

	public static void main(String[] args) {
		String longStr="I am very happy today because today is not Monday";
		
String anotherStr=longStr.replace('a','e');
System.out.println(anotherStr);

anotherStr=longStr.replace("today","tomorrow");
System.out.println(anotherStr);
System.out.println("======");

//regular exprssion
anotherStr=longStr.replaceAll("[a-z]","*" );
System.out.println(anotherStr);
String ssn="234-567-7890";
String newSNN=ssn.replaceAll("[0-9]","*");//or ("[4-7],"*" )
System.out.println(newSNN);
String newSNN1=ssn.replaceAll("[47]","*");
-7System.out.println(newSNN1);

System.out.println("Lets remove the dashes from snn");
String numbers=ssn.replaceAll("[0-9]","");
System.out.println(numbers);


//A task for hard working students
		// Hide all the numbers and leave the last four digits of ssn
		// ***-***-8745
		// Do NOT hard code it :slightly_smiling_face:
	}

}
