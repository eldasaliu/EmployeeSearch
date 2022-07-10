package com.neotech.Review4;

public class ToCharArray {

	public static void main(String[] args) {
		String longstr="I am very happy today,because today is not Monday";
	
		System.out.println(longstr.length());
		char[] charArray= longstr.toCharArray();
		System.out.println(charArray.length);
		for(int i=0;i<charArray.length;i++) {
			
			System.out.print(charArray[i]);
			
		}
		System.out.println();
		
		for(char el:charArray) {
			
			
		System.out.print(el);	
		}
		
		
	}

}
