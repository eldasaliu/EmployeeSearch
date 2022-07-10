package com.neotech.lesson13ReviewExamples;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {
		int [][] numbers=new int [3][4];//[rows][coluums]
numbers[1][2]=3;
numbers[2][1]=7;
numbers[0][0]=5;
numbers[2][0]=6;
//reassign a value to an element
numbers[2][0]+=2;
//numbers[3][1]=9;//run time error we dont have 3 rows
int rows=numbers.length;
System.out.println("The number of rows is :"+ rows);
//the length of the row with index 1 ?
int cols1=numbers[1].length;
System.out.println("The number of colums in the row with index 1:" + cols1);
for (int row=0;row<numbers.length;row++) {
	System.out.println("Row " + row);
	
	for(int col=0;col<numbers[row].length;col++){
		System.out.print(numbers[row][col] + "  ");
	}
}
}

}
