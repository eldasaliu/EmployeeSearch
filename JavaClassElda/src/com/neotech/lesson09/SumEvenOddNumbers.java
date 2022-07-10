package com.neotech.lesson09;
//add even ,odd ,also add all numbers,between 1&&50,using for loop


public class SumEvenOddNumbers {

	public static void main(String[] args) {
		
		int oddTotal=0;
		int evenTotal=0;
		int total=0;
		
		
		
for( int i=1; i<=50; i++) {
	if (i %2==0) {//even
		evenTotal+=i;
	}else {//odd
		oddTotal+=i;
	}
	}
	total+=i;
	System.out.println("the sume of even numbers ..>" + evenTotal);
	System.out.println("the sum of ood numbers..>"+ oddTotal);
	System.out.println("the sum of all numbers"+..> total);
}

}
}
}