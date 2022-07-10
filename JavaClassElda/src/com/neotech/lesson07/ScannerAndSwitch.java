package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		
		// Ask a user to ender their country
		//then print out the language they speak
		Scanner scan=new Scanner ( Syste.in);
		
		String country;
		System.out.println(" Where are you from?");
		country=scan.next();
		
		if (country.equals("Albania")//if country == "Albania' {
			System.out.println("You speak Albania");
		
		}
	else if (country.equals("Usa")
	{
		System.out.println("You speak English");
	}
	else
	{ 
		System.out.println("I dot know what language you speak");
	}
}
//Using Switch
switch (country) 
{
case "Albania" :

	

}