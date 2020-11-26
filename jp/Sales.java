package com.cts.jp;

public class Sales extends Product {

	private int days;
	private double totalAmnt;
	private double serviceTax=0;
	
	public Sales(String name, int code, double amount, int days, double totalAmnt) {
		super(name, code, amount);
		this.days = days;
		this.totalAmnt = totalAmnt;
	}
	
	void compute() {
		double fine=0;
		serviceTax= (12.4/100) * getAmount();
		
		if(days>30) {
			fine= (2.5/100)*getAmount();
		}
		
		totalAmnt= getAmount() + serviceTax + fine;
	}
	
	void show() {
		super.show();
		compute();
		System.out.println("total Amount retailer given is::" +totalAmnt);
	}
	
	
	public static void main(String args[]) {
		
		Sales s1= new Sales("lakme", 746, 245.50, 20,0);
		s1.show();
	} 
}
