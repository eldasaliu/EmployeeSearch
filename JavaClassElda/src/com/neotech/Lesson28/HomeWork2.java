package com.neotech.Lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork2 {
	//Homework 2:
	 //   Create an arrayList of even numbers from 1 to 50.
	//Using Iterator remove any number that is divisible by 5 from that arrayList.
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
//		numbers.add(6);
//		numbers.add(2);
//		numbers.add(1);
//		numbers.add(10);
//		numbers.add(20);
//		numbers.add(8);
//		numbers.add(46);
//		numbers.add(14);
//		numbers.add(30);
//		numbers.add(50);
//		numbers.add(15);
//		numbers.add(7);
		for(int i=1;i<=50;i++) {//increment by 2 or we can do it
			//for(int i=0; i<50;i=1+2)
			//numbers.add(i)//we dont have to put a condition because we start with 0
			//2,4,6,8,10....
			if(i%2==0) {
				numbers.add(i);
			}
		}
		
		System.out.print(numbers);
		System.out.println();
		System.out.println("===========");
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()) {//is there is another number after that or object
			Integer num=it.next();
			if(num%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}
}

