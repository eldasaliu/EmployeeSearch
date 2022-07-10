package com.neotech.Lesson18;

public class CatDemo {

	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.name="Suchi";
		cat1.weight=8;
		cat1.color="Gray";
		
		cat1.sayMeow();
		//Lets create another cat
		Cat cat2=new Cat();
		cat2.name="Mirmir";
		cat2.weight=9;
		cat2.color="Brown-ish";
		
	System.out.println(cat1.name+ " is "+cat1.color);
	System.out.println(cat2.name+ " is "+cat2.color);
	System.out.println("Iam changing the name of cat1 to Daisy");
	cat1.name="Daisy";
	System.out.println(cat1.name);
	System.out.println(cat2.name);
	
	
	System.out.println("---------------");
	cat1.displayCatInfo();
	cat2.displayCatInfo();
	}

}
