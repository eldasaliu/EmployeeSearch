package com.neotech.Lesson21;

public class Plant {

	public static void main(String[] args) {
		Fruits f = new Fruits();
		f.size = "Small";
		f.color = "Red";

		f.taste();
		f.smell();

		System.out.println();

		Cherries c = new Cherries();
		c.size = "Small";
		c.color = "Dark red";
		// extra variable
		c.varieties = "Sweet and Sour cherries";

		c.taste();
		c.smell();
		// extra variable
		c.curative();

		System.out.println();

		Mangoes m = new Mangoes();
		m.size = "Big";
		m.color = "Yellow";
		m.varieties = "Safeda & Sinduri Mango";
        m.taste();
		m.smell();
		m.effects();

	}
}
