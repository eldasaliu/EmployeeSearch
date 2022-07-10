package com.neotech.Lesson23;

public class DegreeTest {

	public static void main(String[] args) {
		Degree d=new Degree();
		d.getPrequisite();//you are calling the method of degree class
		Bachelors d2 = new Bachelors();
		d2.getPrequisite();
		
		Masters d3=new Masters();// here overriding is happening 
		d3.getPrequisite();

	}

}
