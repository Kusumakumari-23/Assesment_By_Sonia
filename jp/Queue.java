package com.cts.jp;

public class Queue {

	private int que[];
	private int size;
	private int front;
	private int rear;
	
	public Queue(int size) {
		super();
		this.size = size;
		this.front=0;
		this.rear=0;
		this.que= new int[size];
	}
	
	public void addEle(int v) {
		
		if(rear==size) {
			System.out.println("OverFlow");
		}
		else {
			que[rear++]= v;
		}
	}
	
	public int delete() {
		
		if(front==0 && rear==0) {
			System.out.println("UnderFlow");
			return -9999;
		}
		else {
			return que[front++];
		}
	}
	
	void display() {
		if(front==0 && rear==0) {
			System.out.println("Queue is Empty");
		}
		else {
			for(int i=front; i<rear;i++) {
				System.out.print(que[i] +"\n");
			}
		}
	}
	
	public static void main(String []args) {
		
		Queue q1=new Queue(100);
		q1.addEle(12);
		q1.addEle(15);
		q1.addEle(28);
		q1.addEle(92);
		q1.delete();
		q1.delete();
		q1.display();
		
	}
}
