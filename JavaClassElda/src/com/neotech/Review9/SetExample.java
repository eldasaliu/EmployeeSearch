package com.neotech.Review9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
//Set is part of collection
	//list| Set|Queue9Three interfaces inherting Collection)
	//ArrayList|LinkedList(Two classes implementing List Interface)
	//HashSet |LinkedHashSet|TreeSet(Thre classes implementing Set interface)
	
	public static void main(String[] args) {
		
		Set <String> africaLinked=new LinkedHashSet<>();
		africaLinked.add("Mali");
		africaLinked.add("Senegal");
		africaLinked.add("Maroco");
		System.out.println("size->" +africaLinked);//I i try to ru Mali 3 times the size will be 1
	//it will not add in the Set ,because it already exist
		africaLinked.add("Senegal");
		africaLinked.add("Kenya");
		
	//an i add with an index in a set? No
		//in a set different order,no insertion order
		//africaLinked.add(1,"Egypt");
		System.out.println("LinkedHashSet" + africaLinked);////if we want to keep the same order 
		
		Set<String> africaHash=new HashSet<>(africaLinked);//the order changed different order is the fastes
		
	System.out.println("HashSet" + africaHash);
	
	Set<String> africaTree=new TreeSet<>();
		africaTree.addAll(africaLinked);
System.out.println("TreeSet" + africaTree);
int size=africaHash.size();
boolean contains =africaHash.contains("Kenya");
boolean isEmpty=africaHash.isEmpty();
boolean ableToRemove=africaHash.remove("Kenya");

System.out.println("I was able to remove Kenya " +ableToRemove);

//Note: You are to able to get or to add or remove by index in a Set we can do this one in a Lis but no in the set
//africaHash.get(1);//this method is on the List but not in the Set Compile gives us an error too
System.out.println("1 st way ,for Loop Doe Not Work in the Test because is not ");
//for(int i=0;i<africaHash.size();i++){
//	africaHash.get(i);
	
	
	System.out.println(" 2 nd way ,enhanced/advanced for Loop");
	for(String c:africaHash) {
		System.out.println(c);
	}
	System.out.println("3d way ,usig iterator");
	Iterator<String> iter=africaHash.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	//difference between List ,Set INTERVIEW QUESTION
	//1.List preseves inrtion order,But Set does Not
	//2. List contains duplicates,But Set contains Uniques objects
}
}
	

