package com.neotech.Review4;

public class VoidVsReturn {

	public static void main(String[] args) {
		
			​
					int num1, num2, year;
					class03_void_vs_return obj = new class03_void_vs_return();
			​
					Scanner scan = new Scanner(System.in);
			​
					
					System.out.println("Enter two number to get the sum: ");
					num1 = scan.nextInt();
					num2 = scan.nextInt();
					
					
					
					obj.add(num1, num2);
					
					int response = obj.add2(num1, num2);// this gets the result from the method, and then assigns it
			​
					// we need the sum here
					
					
					
					
					
					//we want to ask the year that a person was born and if he is above 18 years old, they can drive. If not, the cannot drive.
					System.out.println("Enter the birthyear: ");
					year = scan.nextInt();
					
					int age = obj.calculateAge(year);
					
					//we need age to print if the person can drive
					if (age > 18)
					{
						System.out.println("You are allowed to drive!");
					}
					else 
					{
						System.out.println("You cannot drive!");
					}
					
					//if you got the birthyear just to print the age and not to do any further operations with it
					obj.printAge(year);
			​
				}
			​
				
				//our method should take the birthyear and print the age
				void printAge(int year)
				{
					int age = 2022-year;
					System.out.println("Your age is: " + age);
				}
				
				//our method takes the birthyear and gives us back the age.
				int calculateAge(int year)
				{
					int age = 2022 - year;
					
					return age;
				}
				
				
				
				
				void add(int a, int b) {
					int sum = a + b;
					System.out.println(sum);
				}
			​
				int add2(int a, int b) {
					int sum = a + b;
			​
					return sum;
				}
			​
			}
	}

}
