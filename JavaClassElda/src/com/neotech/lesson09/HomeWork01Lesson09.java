package com.neotech.lesson09;

public class HomeWork01Lesson09 {
//Print numbers from 1 to 50 except those that are divisible by 3

	public static void main(String[] args) {
		System.out.println("Print numbers from 1 to 50 except those that are divisible by 3 :");
		// fully divisible it means there is no remainder

		for (int count = 1; count <= 50; count++) {
			if (count % 3 == 0) {
				continue;
			}

			System.out.print(count + "  ");

		
			
			System.out.println("  = = = ");
		}
		
		//use do while 
		int j =1;
		do {
			
				if (j%3==0) {
					
				j++;
				continue;
			}
	System.out.print(j + " ");
			 
			j++;
			
		} while(j<=50);
		
		}

	//using while
		
	int k  =1;
	while (k <= 50) {
		if (k % 3 == 0) {
			k++;
			continue;
		} else {
			System.out.print(k + " ");
		}
​
		k++;
	}
​
	System.out.println();

}

}