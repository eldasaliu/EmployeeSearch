package com.neotech.Lesson22;

public class AdditionTest {

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(3, 7);
		obj.add(4, 5, 6);
​
		obj.add(2.5, 3.0);
		obj.add(4.0, 2.2, 3.1);
​
		obj.add(3, 3.5, 6);
​
		obj.add(3.5, 5);
​
		obj.add("Omer", 100);
		obj.add(100, "Omer");
	}
​
}
}
