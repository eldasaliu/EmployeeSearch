package com.neotech.Lesson26;

//Homework 1:

//    Create Registration Class in which you would have
//    variables as email, userName and password that
//    have an access scope only within its own class.
//    After creating an object of the class user should be
//    able to call methods and in each method separately
//    pass values to set users email, username and
//    password.
//
//    Requirements:
//    Valid email consider to be only yahoo!
//    Valid userName and password cannot be empty and should be of length larger than 6 characters.
//    Also valid password cannot contain userName.

public class Registration {

	private String email;
	private String userName;
	private String pasword;

	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email = email;
		} else {
			System.out.println("The type of email is yahoo");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty())
			if (userName.length() >= 6) {
				this.userName = userName;
			} else {
				System.out.println("User Name cannot be empty and the length should be larger than 6");
			}
	}

	public String getUserName() {
		return userName;
	}

	public void setPasword(String pasword) {
		if (!pasword.isEmpty() && pasword.length() >= 6) {
			this.pasword = pasword;
		} else {
			System.out.println("Pasword cannot be emty and the length should be larger than 6");
		}
	}

	public String getPasword() {
		return pasword;

	}

}
