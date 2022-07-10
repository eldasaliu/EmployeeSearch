package com.neotech.Review7;

public class American extends MethodOverridingHuman {
	String SSN;
	public American(String name) {
		super(name);
		
	}
	@Override
	public void talk() {
		System.out.println("I speak English .My name is "+ name);
		
	}
public void taxReturn() {
	System.out.println("I am doing my tax return");
}
}
