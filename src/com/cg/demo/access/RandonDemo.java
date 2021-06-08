package com.cg.demo.access;

import java.util.Random;

public class RandonDemo {
	public static void main(String[]args) {
		Random random=new Random();
		int num=random.nextInt(50);
		System.out.println(num);
		
	}

}
