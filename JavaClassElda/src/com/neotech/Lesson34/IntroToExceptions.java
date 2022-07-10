package com.neotech.Lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class IntroToExceptions {

	public static void main(String[] args) throws FileNotFoundException {
 int a=10;
 int b=0;
 System.out.println(a/b);//ArithmeticException---divivision by 0
 
 int[]arr= {2,4,6};
//System.out.println(arr[5]);
 
 String filePath=" ";
 FileInputStream fis=new FileInputStream(filePath);//FileNotfoundException


	}

}
