package com.neotech.Review8;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {
 ArrayList<Integer> numbers=new ArrayList<>();
 boolean isEmty=numbers.isEmpty();
 System.out.println("Isit emty" + isEmty);
 System.out.println("Size is "+ numbers.size());
 numbers.add(new Integer(5));//this is long way
 numbers.add(5);//easy way Auto Boxing
 numbers.add(7);
 numbers.add(2);
 System.out.println("size "+ numbers.size());
 
 //List is an Interface 
 //Array List and Linked List are classes implementing the list Interface
 
 boolean contains =numbers.contains(7);
 System.out.println("Does the list contains the number 7 "+ contains);
 System.out.println(numbers);
 numbers.remove(2);
 System.out.println(numbers);
 System.out.println("How can I iterate the whole ArrayList");
 
 System.out.println("1st way normal for loop");
 
 
 for(int i=0;i<numbers.size();i++) {
	 int element=numbers.get(i);
	 System.out.println(element +" ");
	 
	 
 }
 System.out.println("2nd way enhance for loop");
 
 
 for(Integer element:numbers)
 {
	 System.out.println(element+ " ");//this has some limitions
	 
 }
 System.out.println("3d way using Iterator");
 
 
 Iterator<Integer> it=numbers.iterator();//from the numbers get the iterator from the list
//There are 3 methods in the Iterator class
 it.hasNext();//this method will return the next element from the list
 it.next();//this method will return the next element from the list
 it.remove( );//this method removes the current element from the list
 
 System.out.println(it.next());
 System.out.println(it.next());
// System.out.println(it.next());
// System.out.println(it.next());Run time error is no such as element but we can put if (it.hasNext()

 while (it.hasNext()) {
	 Integer numb=it.next();
	 System.out.print(numbers+ " ");
 }
 
 }

}
