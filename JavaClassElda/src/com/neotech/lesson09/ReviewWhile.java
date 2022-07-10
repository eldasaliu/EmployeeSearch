package com.neotech.lesson09;

public class ReviewWhile {

	public static void main(String[] args) {
String greeting= "Salom Aleykum";//5 times

int count =0;
while (count < 6) {//if i say <= it will go to 7
	System.out.println(count + ". " + greeting);
	count++;
	
	//it doesn't metter if i put count++ in the begining or in the end //no changes
	
}
		
	System.out.println("========");	
	
		int j =1;
		while( true) {
			System.out.println(greeting);
			j++; //it will run forever because is true//when is false it won't run
			//if i want to stop this loop i can only break it for example to print only 3 times
			 if (j==3) {
				 break;//wherever you are skip so if we put b
			 } 
				 j++;
				 System.out.println(greeting);
			 }
		}

	}


