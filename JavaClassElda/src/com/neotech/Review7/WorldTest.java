package com.neotech.Review7;

public class WorldTest {

	public static void main(String[] args) {
	//for the name one the MethodOverriding Human i a goind to create an objec but not for static String planet
		MethodOverridingHuman.planet ="Earth";
		MethodOverridingHuman h1=new MethodOverridingHuman ("Emrah");
		System.out.println("The first human is "+h1.name);
	System.out.println("He lives in "+ MethodOverridingHuman.planet);

	MethodOverridingHuman h2=new MethodOverridingHuman("Mustafa");
	System.out.println(h2.name+"lives in "+MethodOverridingHuman.planet);
	h2.talk();
	
	//if we want to send human to Mars we use MethodOverridingHuman.plane="Mars"
	MethodOverridingHuman.planet="Mars";//we sending everyone to Mars
	
	MethodOverridingHuman h3;//Declaring a variable of type Human but  i cand store human and also Albanians
	h3=new Albanian("Brikenda");//creating an Albanian and assign to h3
	//upcasitng here
	System.out.println(h3.name+"lives in "+MethodOverridingHuman.planet);//because we change it to Mars
	}
	//create a class Turkish and override the talk method 
	//add makeBakllava method
 
	
	
}
