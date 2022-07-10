package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkLesson0702 {
	//Using scanner class to create a calculator.
	// Allow user to enter 2 numbers and operator(+,-,*,/). 
	//Based on operator provide the result to user.

	public static void main(String[] args) {
	Scanner Scanner=new Scanner (System.in);
	System.out.println("Please enter two numbers");
	int d=Scanner.nextInt();
	int a,b,c; 
	a=Scanner.nextInt();
	b=Scanner.nextInt();
	 
    switch(d) {
    
    case 1:
    c=a+b;
    System.out.println("Result=" +c); 
    break;
    case 2 :
    c=a-b;
    System.out.println("Result="+ c);
    break;
    case 3:
    c=a*b;
    System.out.println("Result=" + c);  
    break;
    case 4:
    c=a/b;
    System.out.println("Result" + c);
    break;
    default:
    	
    System.out.println("Not acceptable");
    break;
    
     
    }

	}

}
