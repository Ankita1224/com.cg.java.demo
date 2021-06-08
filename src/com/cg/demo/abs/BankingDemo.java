package com.cg.demo.abs;

abstract class RBI{
	public abstract void doKyc(); 
		
	
	
}

class HDFC extends RBI{
	public void doKyc(){
		System.out.println("ADHAR CARD");
	}
	
}

class ICICI{
	
}

public class BankingDemo {

}

