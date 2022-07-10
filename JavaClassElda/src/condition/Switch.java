package condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner Scanner =new Scanner(System.in);
		System.out.println("Please enter first number");
		double d1=Scanner.nextDouble();
		System.out.println("Please enter the second number");
		double d2=Scanner.nextDouble();

System.out.println('Please enter the operator (+,-,*,/"));
		String operator=Scanner.next();
		double result=0;
		switch (operator) {
		case "+":
			result =d1+d2;
			break;
		case "-":
		result= d1-d2;
		break;
		case"*":
		result=d1*d2;
		break
		case "/":
		result=d1/d2;
		break;
		default:
		System.out.println("Invalid operator");
				
		
			
		}
	}

}
