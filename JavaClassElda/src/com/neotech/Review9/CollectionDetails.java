package com.neotech.Review9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDetails {

	public static void main(String[] args) {
		// 1. List preserves insertion order, BUT SET does NOT
				// 2. List contains duplicates, BUT SET contains UNIQUE objects

				// Collection Framework -- All interfaces and implementation
				// Collection Interface -- Only one interface
				// Collections -- It is a helper/utility class

				Set<Integer> numbers = new HashSet<>();
				numbers.add(45);
				numbers.add(22);
				numbers.add(67);
				numbers.add(30);
				numbers.add(39);

				System.out.println(numbers);

				Integer min = Collections.min(numbers);
				System.out.println("min -> " + min);

				System.out.println("max -> " + Collections.max(numbers));

				// Set cannot be sorted/ordered
				// Collections.sort(numbers);

				// List can be sorted
				List<Integer> numberList = new ArrayList<>(numbers);
				System.out.println("List before sorting -> " + numberList);

				Collections.sort(numberList);
				System.out.println("List after sorting -> " + numberList);

				System.out.println("--------------------------------");
				List<String> students = new ArrayList<>();
				students.add("Farkhad");
				students.add("Emrah");
				students.add("Brian");
				students.add("Firuz");
				System.out.println(students);

				String first = Collections.min(students);
				System.out.println("first -> " + first);
				System.out.println("last -> " + Collections.max(students));

				Collections.sort(students);
				System.out.println(students);

				System.out.println("--------------------------------");

				int[] arr = { 6, 2, 8, 4, 1, 5 };
				Arrays.sort(arr);

				for (int n : arr) {
					System.out.println(n);
				}

			}
		}

	}

}
