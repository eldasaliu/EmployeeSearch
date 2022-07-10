package com.neotech.Lesson20;

public class ConstructorTypes {
	
	String name;
	int age;
	//default constructor:
	//no return type
	//same name as the class
	//we can only have 1 default constructor
	ConstructorTypes()
	{
		System.out.println("I am a non-argument constructor");
	
	}//we can have many parametrized constructor
 ConstructorTypes(String str) {
	System.out.println("Iam a constructor with a string " + str);
}
 
 
 ConstructorTypes(int num){
	 System.out.println("Iam a constructor with an in argument :"+num);
 
 
}
		ConstructorTypes(double num){
			System.out.println("I am a constructor with a double argument:"+ num);
		}
		ConstructorTypes(String str,int num){
			System.out.println("I am a construtor with a string "+ str+ "and int argument"  );
			
		}
		ConstructorTypes(String str,String str2){
			System.out.println("I am a consutractor with two strings:"+ str + " "+str2);
			
		}
//		ConstructorTypes(String str3,String str4,String str5){
//			System.out.println("I am a consutractor with two strings:"+ str3 + " "+str4 + " ");//if we do it in this way then we will print the example down
//		}
		public static void main(String[] args) {
			
			ConstructorTypes ct=new ConstructorTypes("Elda");
			System.out.println("We are on the main method");
			ConstructorTypes ct2=new ConstructorTypes("Elda Keta");

			// Java will point out problems if you try to use a constructor that does not
			// exist
			// ConstructorTypes ct3 = new ConstructorTypes("Emrah", "Sherzod", "Brikenda");
			System.out.println("We are on the main method");
			
		}
	}


