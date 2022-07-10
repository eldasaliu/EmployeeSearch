package com.neotech.Review4;

public class Baby {
	
	String name;
	char gender;
	int weight;
	String hairColor;
	
	void talk() {
	System.out.println(name+" is talking");
	
	}
	void talk(String word ,int times) {
		for(int i=0;i<times;i++) {
			System.out.print(word +" ,");
		}
	}
	void cry() {
		System.out.println(name+" is crying");
	}
	
	void eat() {
		System.out.println("Baby is eating");
		
	}
	void displayInformation() {
		System.out.println(name+ ", gender is "+ gender+",weight is"+ weight);
	}
public static void main(String[] args) {
	Baby baby1=new Baby();//declasing and assining a value
	baby1.name="Elda";
	baby1.weight=8;
	
	
	System.out.println("The name of baby1 is "+ baby1.name);
	System.out.println("The hair color of baby1 is "+ baby1.hairColor);
	baby1.gender='M';
	baby1.hairColor="Brown";
	System.out.println("The hair color of baby1 is"+ baby1.hairColor);
	
	
	System.out.println("============");//creating baby2
	
	Baby baby2;
	//System.out.println(baby2.name);
	//creating a by and assinign it to the variable
	
	baby2=new Baby();
	//Syso(baby2.name);
	baby2.weight=7;
	baby2.gender='F';
	baby2.name="Asian";
	baby2.hairColor="Black";
	
	System.out.println("The hair color of baby1 is"+ baby1.hairColor);
	System.out.println("The hair color of baby2 is\"+ baby2.hairColor");
	System.out.println("===========");
	baby1.cry();
	baby2.cry();
	
	baby1.talk();
	baby1.displayInformation();
	baby2.displayInformation();
	
	
	baby1.talk("Bla",5);
	baby2.talk("gugu",3);
	
	
}
}
