package com.neotech.Lesson17;

public class StringToCharArray {

	public static void main(String[] args) {
		// 
		String sentence="Today is Tuesday and we are in java class";
		char[] charArray=sentence.toCharArray();
		
		for(char c: charArray) {
			System.out.print(c+"|");
		}
		System.out.println();
		System.out.println("the length of the string is "+ sentence.length());//.length is a method
		System.out.println("the length of the array is "+charArray.length);//.length is a property 
		
		//reverse char array
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
			
			
			
		}System.out.println("+++++++");
			//homework
		String s ="yadoT si yadseut dna ew era ni a avaj ssalc";
		String[] result=s.split(" ");
		
		for(String d:result) {
			System.out.print(d+ "|");
		}
	}

}
