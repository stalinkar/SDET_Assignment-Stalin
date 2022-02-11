package com.SDETCoreJava.Assignment4;

import java.util.HashSet;
import java.util.Set;

public class HashsetToObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs = new HashSet<Integer>();
	      hs.add(15);
	      hs.add(71);
	      hs.add(82);
	      hs.add(89);
	      hs.add(91);
	      hs.add(93);
	      hs.add(97);
	      hs.add(99);
	      System.out.println("Elements in set = "+hs);
	      System.out.println("Copying all elements...");
	      Object[] obArr = hs.toArray();
	      for (Object ob : obArr)
	      System.out.print(ob+", ");

	}

}