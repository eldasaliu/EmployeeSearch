package com.neotech.lesson10;

public class ArrayExamples {

	public static void main(String[] args) {
		/*Create an array of words: Java, Saturday, day, coding, is. 
		Print the following sentence using elements of array: "Saturday is Java coding Day".*/

	
	String[] strArray=new String[4];{
		
	}
	
	strArray[0]="Java";
	strArray[1]="Saturday";
	strArray[2]="day";
	strArray[3]="coding";
	
System.out.println(strArray[1] +  " is" + " " + strArray[0] + " "  + strArray[3] + "  day");

}
}