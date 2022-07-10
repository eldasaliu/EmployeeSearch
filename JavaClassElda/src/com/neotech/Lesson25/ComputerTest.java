package com.neotech.Lesson25;

public class ComputerTest {

	public static void main(String[] args) {

		Computer[] c = { new Apple(), new Hp(), new Dell(), new Lenovo() };
		for (Computer comp : c) {
			System.out.println();
			comp.storage();
			comp.antiVirus();
		}

	}

}
