package com.neotech.Lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
	 Flower[] flowerArray= {new ("Rose"),new("Tulip"),new Sunflower("Sunflower")}
	 
	 flowerArray[3]=new Rose("Rose");
	 //you cannot add anymore
	 //flowerArrray[3]=new Rose("Rose");
	 //1st difference : The array is fixed in size
	 
	 
	 //Sore flower elements in an ArrayList
	 
	 ArrayList<Flower> flowerList=new ArrayList<>();//is a class on the collection we cant put elemetns it will grow or can go less
	 flowerList.add(new Rose("Rose"));
	 flowerList.add(new Tulip("Tulip"));
	 flowerList.add(new Sunflower("Sunflower"));
	 
	 System.out.println("================");
	 //enhanced for loop
	 for(object fl:flowerList) {
		 fl.bloom();
	 }
	 
	 System.out.println("==============");
	 //for loop//in two lines
	 for(int i=0;i<flowerList.size();i++) {
	 Flower obj=flowerList.get(i);
	 obj.Bloom();
	 
	 //Call the method for each flower in one line 
	// flowerList.get(i).Bloom();
	}
System.out.println("=============");
//Iterator
Iterator <String> it= flowerlist.iterator();
while (it.hasNext()) {
//	//1 st way
	Flower fl=it.next();
	fl.Bloom();
	
//	//2nd way ,in one line
//	it.next().Bloom();
//	
}
}
}
