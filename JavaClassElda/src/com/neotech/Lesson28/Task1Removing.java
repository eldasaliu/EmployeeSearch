package com.neotech.Lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1Removing {

	public static void main(String[] args) {
ArrayList<String> words=new ArrayList<>();
words.add("maine");
words.add("Hello");
words.add("auido");
words.add("water");
words.add("house");
words.add("super");

System.out.println(words);

Iterator<String> iter=words.iterator();

while(iter.hasNext()) {
	String word=iter.next();
	if(word.endsWith("e")) {
		iter.remove();
	}
}
System.out.println(words);
	}

}
