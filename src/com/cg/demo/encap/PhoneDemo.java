package com.cg.demo.encap;

class Phone{
	void call() {
		System.out.println("Calling");
	
	}
	void sms() {
		System.out.println("Sending sms");
	}
}
class FeaturePhone extends Phone{
	void music() {
		System.out.println("playing music");
		
	}
}
 class SmartPhone extends FeaturePhone{
	 void camera() {
		 System.out.println("clicking pics");
	 }
 }

public class PhoneDemo {
	public static void main(String[]args) {
		Phone phone=new Phone();
		phone.call();
		phone.sms();
		FeaturePhone featurePhone=new FeaturePhone();
		featurePhone.music();
		featurePhone.call();
		featurePhone.sms();
		
		SmartPhone smartPhone= new SmartPhone();
		smartPhone.music();
		smartPhone.sms();
		smartPhone.call();
		smartPhone.camera();
		
		
		
	}

}
