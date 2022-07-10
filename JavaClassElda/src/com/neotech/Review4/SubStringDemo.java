package com.neotech.Review4;

public class SubStringDemo {
	public static void main(String[] args) {
		
	
String longStr="I am very happy today because today is not Monday";
String anotherStr=longStr.substring(5, 7);
System.out.println(anotherStr);

anotherStr=longStr.substring(5);
System.out.println(anotherStr);

System.out.println(longStr);//not changed

longStr=longStr.substring(10);//re-assinging
System.out.println("longStr-->" + longStr);//longStr is changed


//run time error
//longStr.substring(7,5);

//longStr.substring(5,100);//error
//longStr.substring(-3,10);error
}
}
