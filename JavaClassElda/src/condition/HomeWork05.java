package condition;

public class HomeWork05 {

	public static void main(String[] args) {
//		Write a program to implement following logic using
//		if-else if-else statement:
//		 if hour is less than 12 noon, greet with  Good Morning
//	     if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
//		 if hour is greater than or equal to 3 pm, greet with Good Evening

		int hour =9;
		if (hour <12) {
			System.out.println("Good Morning");
		}else if  (hour >= 12) {
				
		if ( hour <15) {
				System.out.println("Good Afternoon");
					
				}
		else {
				System.out.println("Good Evening");
			}
		}
	}

}





