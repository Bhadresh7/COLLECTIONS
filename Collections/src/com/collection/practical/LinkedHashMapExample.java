package com.collection.practical;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		// Create a LinkedHashMap
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		// Adding elements
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);

		// Retrieving elements
		System.out.println("Value for 'Apple': " + map.get("Apple"));

		// Checking existence
		System.out.println("Map contains 'Banana': " + map.containsKey("Banana"));
		System.out.println("Map contains value 2: " + map.containsValue(2));

		// Size and emptiness
		System.out.println("Map size: " + map.size());
		System.out.println("Map is empty: " + map.isEmpty());

		// Iterating through elements
		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map.values());
		System.out.println("Entries: ");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		// Replacing elements
		map.replace("Banana", 5);
		System.out.println("Value for 'Banana' after replace: " + map.get("Banana"));

		//putAll method
		LinkedHashMap<String, Integer> anotherMap = new LinkedHashMap<>();
		anotherMap.put("Date", 4);
		anotherMap.put("Elderberry", 5);
		map.putAll(anotherMap);
		System.out.println("Map after putAll: " + map);

		// Default methods
		System.out.println("Value for 'Cherry' or default: " + map.getOrDefault("Cherry", 0));
		map.putIfAbsent("Fig", 6);
		System.out.println("Map after putIfAbsent 'Fig': " + map);

		// Removing elements
		map.remove("Apple");
		System.out.println("Map after removing 'Apple': " + map);
		map.remove("Date", 4);
		System.out.println("Map after conditionally removing 'Date': " + map);

		// Clear the map
		map.clear();
		System.out.println("Map after clear: " + map.isEmpty());
	}
}
