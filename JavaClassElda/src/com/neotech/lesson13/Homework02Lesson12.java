package com.neotech.lesson13;

public class Homework02Lesson12 {

	public static void main(String[] args) {
		String [][] students= {{"Elda" ,"Jenn" ,"Keta", "Dion"},

	                           	{"A",    "B"   ,  "C"  ,  "F"}};
	                           		
	                           	
	                           	
	       //1<2                    	
	                           	
	        for (int i=0; i < students[1].length; i++)   {
	        	
	        	if( students[1][i].equals("A" ) || students[1][i].equals("B")) {
	        		
	        		
	        		System.out.println(students[0][i] + "  " + students[1][i]);
	        	}
	        	
	        
	                      	
	       }                    	
	                           	
	                           	
	                           	
	                           	
	   
	                           	
		
	}
	
	
}