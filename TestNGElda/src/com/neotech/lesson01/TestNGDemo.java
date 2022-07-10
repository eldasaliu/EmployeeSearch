package com.neotech.lesson01;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test

	public void testOne() {
	
	System.out.println("Test One");
	//we just creatd a method so annotation and we can run this because we dont have main method
}
	@Test
	//if we dont put an annotation its not consider a test
	public void testTwo() {
		
		System.out.println("Test Two");
	
	}
	
	@Test //Annotation
	public void testThree() {
		
		System.out.println("Test Three");
}
	
	
	//Test is running alfabeticaly
	//if we remove @test it will not run 
	
}