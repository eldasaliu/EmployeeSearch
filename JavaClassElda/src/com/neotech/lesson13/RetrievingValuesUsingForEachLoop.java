package com.neotech.lesson13;

public class RetrievingValuesUsingForEachLoop {

	public static void main(String[] args) {
	
String[][]animals= {
		{"cat","dog","bird"},
		{"tiger","lion","bear"},
		{"salmon","seabass","shrimps"}
};
//how do we get row numbers?
int rows=animals.length;
//how do we get the numbers for colums?//we have to know for each colum we are taklking about
int cols=animals[0].length;
String lion=animals[1][1];
for (int row=0;row<animals.length;row++) {
	for(int col=0;col< animals[row].length;col++) {
		System.out.print(animals[row][col] + " ");
		
	}
}
System.out.println();
System.out.println("Using for each lopp");

//how to get elements from 2d arrays

//int [ ] n = {3,4,5};

for ( String [] row : animals) {
	for (String  col: row) {
		System.out.print(col + "  ");
	}
	
	
	}
System.out.println();

}

	
	int[][]grades= {
			{95,86,78},
			{90,92,67,89},
			{77,67,87,88},
			{85,82,83} 
			} ;
	

for (int[] row: grades ) {
	for (int grade:row) {
		System.out.println(grade + "  ");
		
	}
	System.out.println();
	

}

}