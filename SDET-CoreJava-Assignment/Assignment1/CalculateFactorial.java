package com.SDETCoreJava.Assignment1;

import java.util.Scanner;

public class CalculateFactorial {
	public static void main(String[] args) {

		int fact = 1;
		int i = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number factorial need to be found: ");
		int num = sc.nextInt();
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("\nFactorial of " + num + " is: " + fact);
	}
}
