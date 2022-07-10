package com.neotech.Review8;

public class Phone {
private String serialNumber;
private String brand;
private String pasword;

//constractor set instance veriables
public Phone (String serialNumber,String brand,String password) {
	this.serialNumber=serialNumber;
	this.brand=brand;
	this.pasword=pasword;//this is kind of setter
	
}
public void displayInfo() {//getter kind of
	System.out.println("This is a " + brand+" phone with serial number "+ serialNumber);
}
//Getters and setters
//you will be able to change the serial number
//only if you provide the correct pasword
public String getSerialNumber(String password) {
	String result="";
	if(password.equals(password)) {
		result=serialNumber;
		
	}else {
		result="invalid Access";
		
	}
	return result;
}
//public String getSerialNumber() {
///	return serialNumber()//or without this.
	//you will be able to change the serial number
			//only if is 7 charachter long//

public void setSerialNumber(String serialNumber) {
	if(serialNumber.length()==7) {
		
	
	  this.serialNumber=serialNumber;//or with this. in front
	
}
}
//Brand is view ONLY
public String getBrand() {
	return brand;
	
}
}