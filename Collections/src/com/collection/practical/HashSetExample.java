package com.collection.practical;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();


		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Date");
		set.add("Apple");
		
		System.out.println(set);

		// Checking size and contents
		System.out.println("Set size: " + set.size());
		System.out.println("Set contains 'Banana': " + set.contains("Banana"));

		// Iterating over elements
		System.out.print("Set elements: ");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// Removing an element
		set.remove("Banana");
		System.out.println("Set after removing 'Banana': " + set);

		// Adding all elements from another collection
		HashSet<String> otherSet = new HashSet<>();
		otherSet.add("Elderberry");
		otherSet.add("Fig");
		set.addAll(otherSet);
		System.out.println("Set after adding otherSet: " + set);

		// Retaining only the elements in the set that are contained in otherSet
		set.retainAll(otherSet);
		System.out.println("Set after retaining elements from otherSet: " + set);

		// Removing all elements from otherSet
		set.removeAll(otherSet);
		System.out.println("Set after removing elements of otherSet: " + set);

		
		set.clear();
		System.out.println("Set is empty: " + set.isEmpty());
	}



}
