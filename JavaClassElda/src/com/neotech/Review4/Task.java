package com.neotech.Review4;

public class Task {

	public static void main(String[] args) {
		// Hide all the numbers and leave the last four digits of ssn
		// ***_***_8745
		//

		String ssn = "432-567-876";
		String hide = ssn.substring(0, 7).replaceAll("[0-9]", "*") + ssn.substring(7);
		System.out.println(hide);

	}

}
