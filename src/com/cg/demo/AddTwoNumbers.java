package com.cg.demo;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a :");
		int a = sc.nextInt();
		System.out.println(a);
		
		System.out.println("enter b :");
		int b=sc.nextInt();
		System.out.println(b);
		
		System.out.println("enter year:");
		int y=sc.nextInt();
		System.out.println(y);
//sum		
		int c = a + b;
		
		System.out.println(c);
//comparison if else		
		if(a>b) { 
			System.out.println("a is greater");
		}
		else if(b>a) { 
			System.out.println(" b is greater");
		}
		else 
			System.out.println("both are equal");
		
		
//leap year logical	operators	

	 if((y%4==0 && y%100!=0)|| (y%400==0)) {
		 System.out.println("y is leap year");
	 }
	 else {
		 System.out.println("y is not a leap year");
	 }
		

}
}
