package com.neotech.lesson14;

public class Homeworkphone {

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.brand = "Apple";
		iphone.model = "13 Pro";
		iphone.color = "White";
		iphone.year = 2021;

		iphone.ring();
		iphone.call();

		Phone android = new Phone();
		android.brand = "Google Pixel";
		android.model = "5A";
		android.color = "Grey";
		android.year = 2021;

		android.ring();
		android.call();

		Phone nokia = new Phone();
		nokia.brand = "Nokia";
		nokia.model = "6233";
		nokia.color = "Black";
		nokia.year = 2010;

		nokia.ring();
		nokia.call();

	}

}
