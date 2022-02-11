package com.SDETCoreJava.Assignment2;

public class DisplayOddNumber {
	public static void main(String args[]) {
		int number = 187;
		System.out.print("List of even numbers from 1 to " + number + ": ");
		for (int i = 79; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
