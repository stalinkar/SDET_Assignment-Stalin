package com.SDETCoreJava.Assignment1;

public class PrintStructure {

	public static void main(String[] args) {

		int rows = 10, k = 0;

		for (int i = 1; i <= rows; ++i, k = 0) {
			for (int space = 1; space <= rows - i; ++space) {
				System.out.print(" ");
			}

			while (k <i) {
				System.out.print("0 ");
				++k;
			}

			System.out.println();
		}
	}

}
