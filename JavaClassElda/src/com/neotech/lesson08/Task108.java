package com.neotech.lesson08;

public class Task108 {

	public static void main(String[] args) {
		//create a loop going 1 to 7
		/*
		 * Create a boolean variable workDayand assign true create int variable day and
		 * assign it to 1 -As long asit is workDayprint “I need a day off” and increase
		 * day. -Once day is 6 print “I do not need a day off any more”
		 */
boolean workday=true;
int day=1;
while(workday ) {
	
	if (day< 6) {
		System.out.print("I need day off");
	}
		else {
			System.out.print("I don't need day off");
			workday =false;
			day ++;
					
		}
	
}

}
	}


