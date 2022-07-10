package com.neotech.Lesson17;

public class StrinSplit {

	public static void main(String[] args) {
		// split
		
		String sentence="Today is Tuesday and we are in java class";
		String[] result=sentence.split(" ");
		//Today
		//is
		//Tuesday
		
		
		for (String word:result) {
			System.out.print(word + "|");
			
		}
		System.out.println();
System.out.println("this sentence has " + result.length +" words");


String[]array =sentence.split("e");
for(int i=0;i<array.length;i++) {
	System.out.print(array[i]+"|");
	
}
//sabah;ceyda;daler;sema;brian;timucin//for example we want to split these names



System.out.println("==============");

String list="1.Ceyda1.Timucin3.Damla4.Julia";//interview question something like that to spllit a long strin
String[]arr=list.split("^[a-zA-Z]");


for(int i =0;i<arr.length;i++) {
	System.out.print(arr[i]+" - ");
}
System.out.println();
//lets reverse a sentece
for(int i=result.length-1;i>=0;i--) {
	System.out.print(result[i] + " - ");
}




	}
}
