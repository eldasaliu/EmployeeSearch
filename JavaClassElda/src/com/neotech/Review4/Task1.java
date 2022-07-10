package com.neotech.Review4;

public class Task1 {//replace a with e

	public static void main(String[] args) {
		String longstr = "I am very happy today,because today is not Monday";
		String[] StrArray = longstr.split("a");
		for (int i = 0; i < StrArray.length; i++) {
			System.out.print(StrArray[i] + "e");
			
			for(char el:charArray) {
				//if there is only one statment inside the if
				//we can remvoe the curly brackets
				if(el=='a') {
					
			System.out.println('e');{
			else {
				System.out.println(el);
			}
			}
			}
			
			//	System.out.println("\n...> Print to the whole array,but replace\"a\"with\e\") //this prints space
		}
	
			for(int i = 0; i < charArray.length; i++){
			    if(charArray[i] == 'a'){
			        charArray[i] = 'e';
			        System.out.print(charArray[i]);
			    } else {
			        System.out.print(charArray[i]);
			    }
			}
	}
}
}