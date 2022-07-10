package com.neotech.Lesson28;

public abstract class Flower {
String type;
public Flower(String type) {
	this.type=type;
	
}
public abstract void Bloom();

}
class Tulip extends Flower {

	public Tulip(String type) {
		super(type);
	 
	}

	@Override
	public void Bloom() {
		 System.out.println(type+"Blooms in April");
		
	}
	
}
class Rose extends Flower {
	public Rose (String type) {
		super(type);
		
	}

	@Override
	public void Bloom() {
		 System.out.println(type + "blooms in june");
		 
		
	}
}

class SunFlower extends Flower{
	public SunFlower(String type) {
		System.out.println();
	}
}