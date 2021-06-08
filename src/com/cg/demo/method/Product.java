package com.cg.demo.method;

public class Product{
	int productNo;
	String name;
	int mrp;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productNo, String name, int mrp) {
		super();
		this.productNo = productNo;
		this.name = name;
		this.mrp = mrp;
	}
	public Product(int productNo, String name) {
		super();
		this.productNo = productNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", name=" + name + ", mrp=" + mrp + "]";
	}
}
	

		
