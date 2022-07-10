package com.neotech.Lesson31;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
Hashtable<Integer,String>ht=new Hashtable<>();
ht.put(2, "Elda");
ht.put(1, "Liam");
ht.put(3, "Murat");
ht.put(4, "Ela");
System.out.println(ht);
System.out.println("The size of the hashtable is"+ ht.size());
	//whats the diference?(same as HashMap)
//1.it does not allow null(key or values)
//2.it is synchronized
//random order


}
}