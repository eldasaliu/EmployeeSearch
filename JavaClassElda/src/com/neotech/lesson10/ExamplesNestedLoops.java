package com.neotech.lesson10;

public class ExamplesNestedLoops {

	public static void main(String[] args) {

//Ask the user to enter an integer and build the following pattern:
// *********
//  *******
//   *****
//    ***
//     *
     
     
     
		
	}
	

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int num = input.nextInt();
    // print the upper pattern, first 5 rows
//  1 
//  1 2 
//  1 2 3 
//  1 2 3 4 
//  1 2 3 4 5 
    for (int row = 1; row <= num; row++) {
        for (int col = 1; col <= row; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
    }
    // print the bottom pattern, other 4 rows
//  1 2 3 4 
//  1 2 3 
//  1 2 
//  1
    for (int row = num - 1; row >= 1; row--) {
        for (int col = 1; col <= row; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
    }
}
}
	

}
 