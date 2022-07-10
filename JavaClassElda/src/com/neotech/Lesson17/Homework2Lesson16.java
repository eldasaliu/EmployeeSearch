package com.neotech.Lesson17;

public class Homework2Lesson16 {

	public static void main(String[] args) {
		//

		String str="Hello1234^ %*&ALL";
		//[abc]
		//[a-c]
		//[^a-f]
		
		String str2=str.replaceAll("[^a-zA-Z]","");
		System.out.println("The length of the alpha string is :"+ str2.length());
				
		
		//what if we want to find out how many numbers we have there?
		
		String str3=str.replaceAll("[^0-9]", "");
		System.out.println(str3);
	//what if we need to keep all the special characters??
		String str4=str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(str4);
		
		//be carful -this is not a regulation express
		String demo=str.replaceAll("a-z","-");
		System.out.println(demo);
		
		demo=str.replaceAll("[az]", "+");//this also
		
		
	}

}
