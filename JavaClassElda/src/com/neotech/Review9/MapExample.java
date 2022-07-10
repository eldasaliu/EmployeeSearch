package com.neotech.Review9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		
	//keys we can return with Set keySet();
	phoneBook.put(123456789, "John Smith");
	phoneBook.put(234567890, "Julia Roberts");
	phoneBook.put(345678901, "Donald Trump");
	phoneBook.put(111111111, "Obama");
	phoneBook.put(678901234, "Brad Pitt");
	phoneBook.put(444444444, "John Smith");

	// It will replace Julia Roberts
	// phoneBook.put(234567890, "Murat");
	// replace does the same thing
	phoneBook.replace(234567890, "Murat");

	System.out.println(phoneBook);

	// Map is one directional, from key to value
	String name = phoneBook.get(234567890); // get the value by using the key
	System.out.println(name + " is calling...");

	name = phoneBook.get(5555);
	System.out.println(name + " is calling...");

	boolean containsK = phoneBook.containsKey(5555);
	System.out.println("5555 is in the map -> " + containsK);

	System.out.println("Obama is in my contact list -> " + phoneBook.containsValue("Obama"));

	phoneBook.remove(345678901); // Will remove Trump from my map
	System.out.println(phoneBook);

	System.out.println("The size of my phoneBook is -> " + phoneBook.size());

	System.out.println("--------phoneBook.keySet()--------");
	// Let's get all the keys and store them in a SET
	Set<Integer> numbers = phoneBook.keySet();
	System.out.println(numbers);

	Iterator<Integer> itNums = numbers.iterator();
	while (itNums.hasNext()) {
		Integer number = itNums.next();
		String personName = phoneBook.get(number); // Find name by using the number

		System.out.println(number + " -> " + personName);
	}

	// Task
	// Get the values and iterate them using an enhanced for loop
	// Try to get the number by using the name!!!

	System.out.println("--------phoneBook.values()--------");
	// Let's get all the values and store them in a COLLECTION
	Collection<String> names = phoneBook.values();
	System.out.println(names);

	for (String element : names) {
		System.out.println(element);
	}

	// from the value you CANNOT find the key

	System.out.println("--------phoneBook.entrySet()--------");
	// Let's get all the entries and store them in a SET
	Set<Entry<Integer, String>> entries = phoneBook.entrySet();
	System.out.println(phoneBook);
	System.out.println(entries);

	System.out.println("--------using enhanced for loop--------");
	for (Entry<Integer, String> entry : entries) {
		// System.out.println(entry);
		Integer key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key + " -> " + value);
	}

	System.out.println("--------using ietrator--------");
	Iterator<Entry<Integer, String>> entryIt = entries.iterator();

	while (entryIt.hasNext()) {
		Entry<Integer, String> entry = entryIt.next();
		System.out.println(entry.getKey() + " <-> " + entry.getValue());
	}
}
}
}