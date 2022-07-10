package com.neotech.lesson13;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		
		System.out.println("How many rows do you want to store in the array ?");
		int rows=input.nextInt();
		
		
		System.out.println("How many colums do you want to store in the array ?");
		int cols =input.nextInt();
		
		//create the array (string[][] names)
		String [][]arr=new String[rows][cols];
		
		//fill the array
		
		for(int row=0;row<arr.length;row++) {//for(in i=0;i<rows;i++){
			for(int cols=0;cols<arr.length[row];cols++) {//for(int j=0;j<cols;j++){
				
				System.out.println("Please enter a name:");
				arr [rows][cols]=inpur.next();
		}
		System.out.println();
		}//print the array  i will use an enhanced for loop 
		for(String[] name:names) {
			
			for(String name:row) {
				System.out.println(name + " ");
			}
			
			System.out.println();
		}
			

}
}