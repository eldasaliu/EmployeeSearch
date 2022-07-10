package com.neotech.Review7;

public class Apple extends Fruit implements Peelable {
public Apple(String color) {
	super(color);
}

@Override
public void peel() {
	 System.out.println("Peeling the apple");
	 
	 
	
}
@Override
public void wash () {
	System.out.println("Washing the fruit");
}
}
