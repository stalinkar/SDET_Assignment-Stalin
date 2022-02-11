package com.SDETCoreJava.Assignment4;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Tapas");
		hm.put(102, "Rajesh");
		hm.put(101, "Alok Kumar");
		hm.put(103, "Avinash");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
