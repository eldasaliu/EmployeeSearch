package com.neotech.Lesson34;

public class InfoAboutExceptions {

	public static void main(String[] args) {
String str="Hello";
char c=str.charAt(10);
System.out.println(c);
//try to run the code,if you have problems then run tthe catch block
try {
	

char c=str.charAt(10);
System.out.println(c);

int a=10;
int b=0;
System.out.println(a/b);
}
	
	catch(StringIndexOutOfBoundsException e) {
//		//we can display info about error
//		e.printStackTrace();
//		System.out.println(e);
//		System.out.println(e.getMessage());
		
		System.out.println("Dont try to access with wrong index");
		
		
	}
System.out.println("End of code");
}
}