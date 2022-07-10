package com.neotech.Review7;

public class Albanian extends MethodOverridingHuman {
public Albanian() {
	super();//even i dont do it its already called the super
	
}
public Albanian(String name) {
	super(name);
	
}
//method overriding here we want to change the behavior
@Override
public void talk() {
	System.out.println("Une flas shqip.Une quhem Elda");
}
public void AlbanianDance() {//this is an extra method/behavior
	System.out.println("Dancing Valle Kosovare ");
	
}
}
