package com.neotech.Lesson23;

public class Degree {
//	Create a class 'Degree' having a method 'getPrerequisite' that prints "To get a degree you need high school diploma".
//	Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite’.
//	Call the method by creating an object of each of the three classes.
	
	public void getPrequisite(){
		System.out.println("To get a degree you need high school diploma");
	}
	}
	class Bachelors extends Degree{
	}
	
	class Masters extends Degree{
		public void getPrequisite()	{
			System.out.println("To get Master you need Bachelor deploma");
		}
	}


