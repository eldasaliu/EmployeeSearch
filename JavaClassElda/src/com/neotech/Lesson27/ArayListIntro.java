package com.neotech.Lesson27;

import java.util.ArrayList;

public class ArayListIntro {

	public static void main(String[] args) {
		int[] numbers=new int[4];//you have to specify the size and cannot change
		ArrayList<String>names=new ArrayList<String>();	
int size =names.size();//size() method returns the number of elements inside the 

System.out.println("size:" +size);
names.add("emre");/ if we want to remove the string we can
names.add("Bugra");
names.add("Enerik");
System.out.println("size:"+ names.size());
System.out.println(names);
names.add("Daler");
System.out.println(names);
names.remove("Bugra");//removing one element from the arrayList

System.out.println(names);

String name=names.get(2);//get one element with index 2
System.out.println(name);
System.out.println(names);

System.out.println("Iterating the ArrayList with the for Loop");
for(int i=0;i<names.size();i++){
	String element=names.get(i);
	System.out.println(element);
	
}
//Declare an array list that contains String object



}
