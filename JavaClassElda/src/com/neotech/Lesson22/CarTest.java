
package com.neotech.Lesson22;

public class CarTest {
	public static void main(String[] args) {
//		Car c1 = new Car();
//		Car c2 = new Car("BMW", "M5");
​
		System.out.println("--------------------------------");
		Mercedes m1 = new Mercedes(); // using the default constructor
		m1.display();
​
		System.out.println("--------------------------------");
		Mercedes m2 = new Mercedes("Mercedes", "C", "AMG");
		m2.display();
	}
​

}
