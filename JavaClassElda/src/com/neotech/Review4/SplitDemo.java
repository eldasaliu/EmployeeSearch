package com.neotech.Review4;

public class SplitDemo {

	public static void main(String[] args) {
		String longstr="I am very happy today,because today is not Monday";
		String[] stringArray=longstr.split(" today");
		System.out.println(stringArray.length);
		System.out.println("-----Iterating using enhanced for loop---");
		for(String element:stringArray) {
			System.out.println(element);
		}
		System.out.println("----Itereting using Normal for looop");
        for(int i=0;i<stringArray.length;i++) {
        System.out.println(stringArray[i]);
		
	}
System.out.println();
longstr="I like number 5 and 6 because 7 ate 9.";
stringArray =longstr.split("[6-9]");////looking for numbers from 6 to 9
//stringArray=longStr.split("[69]");//looking for number from 6 and 9
//stringArray=longStr.split("69")//looking for the String 69
	System.out.println(stringArray.length);
for(String str:stringArray) {

System.out.println(str);
}

}
}