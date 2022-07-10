package com.neotech.lesson13ReviewExamples;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//funny way
		int a1=5;
		int a2=6;
		int a3=9;
		int a4=7;
		int sum=a1 + a2 +a3 + a4;
		System.out.println("Sum is __>" + sum);
		
		
		
		
		System.out.println("++++++++++=");
		//1st serious way
		int[] array=new int[4];
		array[0]=5;
		array[1]=6;
		array[2]=9;
		array[3]=7;
		
		int sumArray=0;
		for(int i=0;i<array.length;i++) {
			sumArray += array[i];
		}
		
		System.out.println("Summ of the array is:" + sum);
		
	
//2nd serious way
	//inhance for loop
	int[] array2= {5,6,9,7};
	
	int sumArray2 = 0;
	for(int num : array2) {
	
	sumArray2 += num;
	}
	System.out.println("Sum" + sum);
	
	System.out.println("   ======       ");
	
	String [] animals= {"dog","cat","mouse","elefant","human","bird"};
	for(int i=0;i<animals.length;i++) {
		System.out.println(animals[i]+ "  ");
		
		
	}
	System.out.println();
	for (String element:animals) {
		System.out.println(element + "  ");
		
	}
	System.out.println();//if we put more animals it doesnt change anything because i<animals.lenth

	
	
	System.out.println("=============");
	
	System.out.println("Lets print the animals in reverse order");//always count reverse from index no the length so we have int 5 animals
	
	for (int i=animals.length-1;1>=0;i--) {
		System.out.println(animals[i] + " , ");
	}
	
	
}	
}
