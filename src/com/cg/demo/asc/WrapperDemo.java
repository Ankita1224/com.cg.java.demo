package com.cg.demo.asc;

public class WrapperDemo {
	public static void main(String[]args) {
//		String name="Anki";
//		int num=10;
//		Integer num2=10;
//		n
		WrapperDemo obj = new WrapperDemo();
		WrapperDemo obj2= new WrapperDemo();
		
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println(obj.equals(obj2));
		System.out.println(obj==obj2);
	}

}
