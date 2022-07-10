package com.neotech.lesson15;

public class Largest {
	//Create a method that will take 2 parameters as numbers and prints which number is larger.
	//Create a method that will take a number and prints whether the number is even or odd.

	
	//Create a method that will say Hello in different language based on the country that will passed when method is executed
	
	void larger(int a,int b) {
		if(a>b) {
			System.out.println(a + "is the largest");
			
		}
		else if(b>a){
			System.out.println(b + "is the largest");
		
	} 
		else {
		System.out.println("Numbers are equal");
	}
		
		
		
	}
	//Create a method that will take a number and prints whether the number is even or odd.
	
	void evenOdd(int num) {
		if(num%2==0)
		{
			System.out.println(num + "is even");
			
		}else {
			System.out.println(num+ "is odd");
		}
		}
	
	void sayHello(String country) {
		switch (country) {
		case"US":
			System.out.println("Hello");
			break;
		case "Tajikistan":
		System.out.println("Salom");
		break;
		case "Taiwan":
		System.out.println("Ni Hao");
		break;
		case "Uzbekistan":
			System.out.println("Salom");
			break;
			default:
				System.out.println("I dont know "+ country);
			
		}
	}
	public static void main(String[] args) {
		Largest num= new Largest();
		num.larger (7,3);
		num.larger (4,8);
		num.larger(8,8 );
		
		
		num.evenOdd(519);
		
		
		num.sayHello("Tajikistan");
		num.sayHello("Taiwan");
		num.sayHello("Taiwan");
		num.sayHello("Germany");
	}
}
