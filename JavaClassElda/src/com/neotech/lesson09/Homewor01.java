package com.neotech.lesson09;

public class Homewor01 {

	public static void main(String[] args) {
		//1 way
		int i=0;
				int sum=0;
				while (i <=10) {
					if (i%2==0) {// checking for even numbers
					System.out.println(i);
					sum=sum +i;
					}
					i++;
				}
		//2 way increment by 2
				int m=0;
				int total=0;
				while (m<=10) {
					total = total +m;
					m=m +2;
					
				}
System.out.println("total="+ total);
	}

}
