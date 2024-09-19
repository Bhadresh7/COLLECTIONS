package com.collection.practical;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();

		map.put("Apple", 10);
		map.put("Banana", 12);
		map.put("Cherry", 15);

		// Checking size and contents
		System.out.println("Map size: " + map.size());
		System.out.println("Map contains 'Banana': " + map.containsKey("Banana"));
		System.out.println("Map contains value 2: " + map.containsValue(2));

		// Accessing elements
		System.out.println("Value associated with 'Banana': " + map.get("Banana"));

		// Iterating through elements
		System.out.print("Keys: ");
		for (String key : map.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();

		System.out.print("Values: ");
		for (Integer value : map.values()) {
			System.out.print(value + " ");
		}
		System.out.println();

		System.out.println("Entries:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		// Replacing an element
		map.replace("Banana", 3);
		System.out.println("Map after replacing 'Banana' value: " + map);

		// Removing an element
		System.out.println(map.remove("Apple"));
		System.out.println("Map after removing 'Apple': " + map);

		// Clearing the map
		map.clear();
		System.out.println("Map is empty: " + map.isEmpty());
	}
}
