package com.cg.demo.labexercise;

public class CalculateSum {
	int n;
	int a=1;
	int sum=0;
	
	
	
	int calculateSum(int sum) {
		while(a<=n) {
			if(a%3==0 || a%5==0  ) {
				sum=sum+a;
				a++;
				
				
			}
			
		}
		return sum;
		
	}
	
}
