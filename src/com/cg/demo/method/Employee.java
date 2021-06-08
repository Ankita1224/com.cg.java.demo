package com.cg.demo.method;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee(){
		 System.out.println(" default constructor");
	
	}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("parameterized constructor");
		
	}
	
	public String toString() {
		return "Employee[id="+id+" , name="+name+",salary="+salary+"]";
		

			
	}

}
