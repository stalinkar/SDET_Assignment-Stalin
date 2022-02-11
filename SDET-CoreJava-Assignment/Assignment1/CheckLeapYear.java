package com.SDETCoreJava.Assignment1;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("The year "+year+" is a leap year");
	      else
	         System.out.println("The year "+year+" is not a leap year");
	   }    

}
