package com.cts.jp;

public class Product {

	private String name;
	private int code;
	private double amount;
	
	public Product(String name, int code, double amount) {
		super();
		this.name = name;
		this.code = code;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	void show() {
		System.out.println("name--" +name+ "\n code--" +code+ "\n amount--" +amount);
	}
	
}
