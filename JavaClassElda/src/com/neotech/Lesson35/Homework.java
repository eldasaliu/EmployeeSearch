package com.neotech.Lesson35;

class checkUserName extends RuntimeException {
	public checkUserName(String ch) {
		super(ch);
	}
}

public class Homework {
//		Homework 1:
//		    Create a method checkUserNamet hat will throw a runtime exception.
//		    Method should throw an exception 
//		    when the entered username is less than 5 characters.
	public static void checkCharacters(String username) throws Exception {

		if (username.length() < 5) {
			throw new Exception("Invalid,try again");
		} else {
			System.out.println("Username has 5 characters");
		}
	}

	public static void main(String[] args) {
		try {
			checkCharacters("elda");
		} catch (Exception che) {
			System.out.println(che.getMessage());
		}
	}
}