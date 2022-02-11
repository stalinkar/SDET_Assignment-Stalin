package com.SDETCoreJava.Assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParticularKayHashMap {

	public static void main(String[] args)
	{

		// Create a HashMap
		HashMap<Integer, String>
		map = new HashMap<>();

		// Populate the HashMap
		map.put(1, "Broadridge");
		map.put(2, "Financial");
		map.put(3, "Solutions");

		// Get the key to be removed
		int keyToBeChecked = 2;

		// Print the initial HashMap
		System.out.println("HashMap: " + map);

		// Get the iterator over the HashMap
		Iterator<Map.Entry<Integer, String> >
		iterator = map.entrySet().iterator();

		// flag to store result
		boolean isKeyPresent = false;

		// Iterate over the HashMap
		while (iterator.hasNext()) {

			// Get the entry at this iteration
			Map.Entry<Integer, String>
			entry = iterator.next();

			// Check if this key is the required key
			if (keyToBeChecked == entry.getKey()) {

				isKeyPresent = true;
			}
		}

		// Print the result
		System.out.println("Does key " + keyToBeChecked + " exists: " + isKeyPresent);
	}

}