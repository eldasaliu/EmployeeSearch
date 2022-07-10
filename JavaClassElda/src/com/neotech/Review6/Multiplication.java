package com.neotech.Review6;

public class Multiplication {
	//Method overloading : The name of the method should be the same

public static void mutipy(int num1,int num2) {
	int result =num1*num2;

System.out.println(result);

}//is this method overloading if the method is not static ?  Yes
public static void multiply(int num1,int num2,int num3) {
	//what if this is private is this overloding? It doesnt metter yes
//what if i return(is not partof Method signature) is this overloading? yes it doesnt metter
//Access modifier is Not part oof Method signanute only this part (int num1,int num2,int num3) it affects on overloading
	System.out.println(num1*num2*num3);
	
}
public static void multiply(double d1,double d2) {
	double result=d1*d2;
	System.out.println(result);
	}
	//we can pass an array also
	public static void multiply(int[]numbers) {
	//Task myltiply all the numbers in the array
	//and print the result
	int result=1;
	for(int num:numbers) {
		result *=num;
	}
System.out.println( result);
}

public static void main(String[] args) {
	Multiplication.multiply(3,5);//we dont need to specify the class
	
	multiply(3, 5, 4);
	multiply(2.5,4.0);
	int[]array= {2,5,3,5};
	multiply(array);
	
}
}