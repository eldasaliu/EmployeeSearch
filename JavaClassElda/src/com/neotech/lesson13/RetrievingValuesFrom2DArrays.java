package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrays {

	public static void main(String[] args) {
		
		
		String[][] months= { 
				{"Dcemeber","January","February"},
			    { "March","April","May}",
		    	{ "June","July","August"},
			    {"September","October","November"}
		    	           };
			
			            	
				
		int row= months.length;
		int cols=months[0].length;//since all rows have the same number of colums,we can use 0-3
			System.out.println("The number of rows is "+ rows + "and the number of colums is "+ cols);
			// frist loop
			
			for (int row =0;row< months.length ; row++)
			{
				//second loop -cols
				for(int col=0; col< months[row].length; col++)
				System.out.println(months [row][col] + "  ");
			}
		//System.out.println(row);

	


		}
		System.out.println();
		
		int [ ][] numbers = {
				{ 1,4,6},
				{2,3,4,5,6},
				{8} };// int cols2=numbers[0].length ; //for every row we the same number of colums
		//this loop goes from 0,1,2
		for (int row =0; row< numbers.length;row++)
		{
			System.out.println("Numbers of elements in row "+row + "is"+ numbers[row].length);
			//when ro..> 0 this loop goes from 0,1,2
			//when row ..> 1, this loop goes from 0,1,2,3,4
			
			
			for (int col=0; col< numbers[row] ;col ++)
				
			{
				System.out.println();
			}
				
		
				
		
}