package com.cg.demo.encap;

class Parent{
	double bankBalance
}

public class EncapDemo {
	public static void main(String[]args) {
//		BankCustomer obj= new BankCustomer();
//		
//		obj.balance = 10000;
//		System.out.println(obj.checkBalance());
//		
//		obj.deposit(15000);
//		System.out.println(obj.checkBalance());
//		
//		obj.withdraw(2000);
//		System.out.println(obj.checkBalance());
		Demo demo=new Demo();
//		demo.num=10;
		
		System.out.println(demo.getNum());
		demo.setNum(10);
		System.out.println(demo.getNum());
	}

}
