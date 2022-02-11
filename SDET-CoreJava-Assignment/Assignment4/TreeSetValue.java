package com.SDETCoreJava.Assignment4;

import java.util.TreeSet;

public class TreeSetValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(100);  
        set.add(200);  
        set.add(-55);  
        set.add(-40);  
        System.out.println("Lowest Value: "+set.pollFirst());  
        System.out.println("Highest Value: "+set.pollLast());  

	}

}

