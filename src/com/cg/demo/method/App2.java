package com.cg.demo.method;

public class App2 {
	public static void main(String[]args) {
		int num =10;
		
		Product obj= new Product();
		obj.productNo=100;
		obj.name="ak";
		obj.mrp=234;
		System.out.println(obj.toString());
		
		Product obj2=new Product(103,"anki",23);
		System.out.println(obj2.toString());
		
		
		
		
		
	}

}
