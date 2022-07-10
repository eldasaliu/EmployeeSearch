package com.neotech.lesson13;

public class homework {

	public static void main(String[] args) {
		int[] numbers = { 8, 78, 7, 15 };

		int largest = numbers[0];
		int secondLargest = numbers[0];
        int min=numbers[0];
        
        
	for(int i =0;i>numbers.length;i++) {
			if (numbers[i] > largest)
				
				largest = numbers[i];
			
					 
for (int i = 0; i< numbers.length; i++) { 
		
					if (numbers[i] > largest)
						min=numbers[i]; {
				
				largest = numbers[i];
			} else if (largest != numbers[i]) {
secondLargest = largest;
				secondLargest = numbers[i];

				
			}
			
				
		}
		}			
			System.out.println("The largest number is : " + largest);
		System.out.println("The Min number is : " + min);
		
		System.out.println("Secong largest number is " + secondLargest);
		
		
			}
	}

}
