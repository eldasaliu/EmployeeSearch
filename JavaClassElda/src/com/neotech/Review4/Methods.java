package com.neotech.Review4;

public class Methods {
	void sayWelcome() {
		for(int i=0;i<3;i++) {
			System.out.println("Welcome");
		}
	}
	void sayWelcomeWithNumber(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("Welcome");
		}
		System.out.println();
	}
			void sayGreeting(String greeting,int n) {
				for(int i=0;i<n;i++) {
					System.out.println(greeting + " ");
			}
			}
public static void main(String[] args) {
	Methods m=new Methods();
	m.sayWelcome();
	m.sayWelcomeWithNumber(4);
	m.sayGreeting("Hola",5);
	
}
}
