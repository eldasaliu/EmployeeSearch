package com.neotech.Lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 

public class Task {

	public static void main(String[] args) {
ArrayList<String> st=new ArrayList<>();
st.add("Elda");
st.add("Dion");
st.add("Liam");
st.add("Elda");
System.out.println(st);
//LinkedHashSet-no dublicates,isertion order
Set<String> s=new LinkedHashSet<>();
s.addAll(st);
	
System.out.println(s);

//HashSet-no dublicate,no order
Set<String> str=new HashSet<>();
st.addAll(st);
System.out.println();


//TreeSet-no dublicates,acending order
Set<String> ts=new TreeSet<>();
ts.addAll(st);
System.out.println(ts);

//how do we get a specific value
if(st.contains( "Dion")) {
	System.out.println("Contains Dion");
}
//can we covert sets back to list?
List<String> st=new ArrayList<>(str);
//list.addAll(str);-using addAll
//when converted to a list ,we can add dublicates again

	//can we convert set to array
Object[] array=str.toArray();
//Arrays class is a utility class
Arrays.sort(array);

//for collections we have a utility class as well
Collections.sort(st);
System.out.println(st);
	
	}
}