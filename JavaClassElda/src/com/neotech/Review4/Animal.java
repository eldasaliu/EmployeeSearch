public class Animal {
	String type;
	String color;
	static int count;
​
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.type = "bear";
		a1.color = "white";
		Animal.count++;
​
		Animal a2 = new Animal();
		a2.type = "wolf";
		a2.color = "black";
		Animal.count++;
​
		Animal a3 = new Animal();
		a3.type = "giraffe";
		a3.color = "red";
		Animal.count++;
​
		System.out.println(a3.count);
	}
​
package com.neotech.Review4;

public class Animal {

}
}