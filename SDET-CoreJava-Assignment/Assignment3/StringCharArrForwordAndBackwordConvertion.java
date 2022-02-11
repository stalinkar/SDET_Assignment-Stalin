package com.SDETCoreJava.Assignment3;

public class StringCharArrForwordAndBackwordConvertion {
	
	public static void main(String[] args) {
 
        String str = "DevLabs"; 
        char[] characterArray = str.toCharArray(); 
        System.out.println("After converting String to Char array:");
        for (char c : characterArray) {
            System.out.print(c+", ");
        }
        String stringFromCharacters = new String(characterArray); 
        System.out.println("\nAfter converting Char array to String:");
        System.out.println(stringFromCharacters);
	}

}
