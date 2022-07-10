package com.neotech.Review7;

public class Albania extends Human {

	public Albania(String name) {
		super(name);
		 
	}
@Override //when we see the error message
public void talk() {
	//implemented talk method
	System.out.println(name+"says Pershendetje");
	
}
public void albanianDance() {
	System.out.println("Dancing Valle Kosovare");
	
}
}
