package com.cg.demo.labexercise;

import java.util.Scanner;

public class CubesofDigit {
	static int sum=0;
	static int b=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		
		int n = sc.nextInt();
		
		while(n!=0) {
			b=n%10;
			sum=sum+b*b*b;
			n=n/10;
			
			
			
		}
		System.out.println(sum);
		System.out.println("ankita");
		
		
	}
}
	