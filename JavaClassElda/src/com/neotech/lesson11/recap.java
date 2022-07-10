package com.neotech.lesson11;

public class recap {

	public static void main(String[] args) {
		int[] grades=new int[5];
		System.out.println("the size of the array is  " + grades.length);
System.out.println("grade with index 2 is..>"  + grades[0]);
grades[3]=85;
grades [1]=90;
//grades[5]=100;//it doesnt run because is no space the index goes from 0 to 4
//grades[2]="three"//compile-time error no mix string with int allow

grades[2]=100;
grades[4]=78;
grades[4]=98;//reasign a value to the element with 4
grades [0]=93;
int size=grades.length;
System.out.println("the size of the array after we enter some values...> 5");

System.out.println("grade with index 2 is..>"  + grades[2]);
System.out.println("Lets find the average of the class ");


//1st way ,silly way
int total=grades[0]+ grades[1] + grades[2]+ grades[3]+ grades[4];
System.out.println("the total is --> " + total);


int average= total/5;
System.out.println("the avarage is " + average);

System.out.println("---------");




//2nd way using for loop
int sum=0;
for(int i=0;i<5;i++) {
	sum+=grades[i];
	
	
}
System.out.println("The sum is--> " + sum);
System.out.println("The average is-->" + sum/grades.length);


System.out.println(" ------- ");

String[] cities = { "Tashkent", "Tirana", "Dushanbe", "Taipei", "Ankara", "Moskow" };
System.out.println(cities[3]);
System.out.println("The length is -> " + cities.length);
int length = cities.length;
System.out.println("The last city in the array is -> " + cities[length - 1]);
for (int i = 0; i < cities.length; i++) {
    System.out.println(cities[i]);
}
System.out.println("----------------");
System.out.println("Let us print the array in reverse order!");
for (int i = cities.length - 1; i >= 0; i--) {
    System.out.println(cities[i]);
}






	}

}
