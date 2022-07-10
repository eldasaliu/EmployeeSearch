package condition;

import java.util.Scanner;

public class ReviewAllClasses {

	public static void main(String[] args) {
		//Using scanner class to create a calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
		
		
Scanner Scanner =new Scanner(System.in);
System.out.println("Please enter first number");
double d1=Scanner.nextDouble();
System.out.println("Please enter the second number");
double d2=Scanner.nextDouble();



String operator=Scanner.next();
double result=0;

if (operator.equals("+")) {
	result=d1+d2;
	System.out.println("The result is " + (d1 +d2));

} else if (operator.equals("-")) {
	result=d1-d2;
	System.out.println("The result is " +(d1-d2));
}else if (operator.equals(" /" )) {
	result=d1/d2;
	System.out.println("Thw result is " + (d1/d2));
}
else {
	System.out.println("invalid operator");
}



	}

}
