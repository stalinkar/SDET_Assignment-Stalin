package com.SDETCoreJava.Assignment1;

import java.util.Scanner;

public class CalculateTiangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double area, base, height;
		System.out.println("Enter the base of the triangle");
		base = in.nextFloat();
		System.out.println("Enter the height of the triangle");
		height = in.nextFloat();
		area = (0.5) * base * height;
		System.out.println("The area of the  triangle is=" + area);
	}

}
