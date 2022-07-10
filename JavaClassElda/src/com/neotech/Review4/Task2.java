package com.neotech.Review4;

public class Task2 {
	
			void sayGreeting(String greeting,int n) {
				for(int i=0;i<n;i++) {
					System.out.println(greeting + " ");
			}
			
			}
public static void main(String[] args) {
	Task2 t=new Task2();
	t.sayGreeting("Hi", 5);
}
}
