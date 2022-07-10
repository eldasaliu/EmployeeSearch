package com.neotech.Lesson26;

public class Doctor {
	private long licenseID;
	private long phoneNumber;
	private String email;
	
	
	//create setter for email
	public void setEmail(String email) {
		if (!email.isEmpty()) {
			if(email.contains("gmail")) {
				this.email=email;
				
			}
			else
			{
				System.out.println("You have to use gmail");
			}
		}
			else {
				System.out.println("Email cannot be empty");
				
			}
			
		}
		//create getter for email
		public String getEmail() {
			return email;
		}
		//create setter for phone number
		public void setPhoneNumber(long phoneNumber) {
			
			//we can add a logc that checks if the nubmber has 10 digits
			this.phoneNumber(){
				
			}
			public long getPhoneNumber() {
				return phoneNumber;
			}
	}

}
