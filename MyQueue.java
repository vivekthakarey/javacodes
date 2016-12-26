package com.vivek.javageek;

public class MyQueue {

	public int [] array = new int[5];
	private int front = -1,rear = -1;
	
	public boolean isEmpty(){
		if(front == -1 && rear == -1){
			return true;
		}else{
			return false;
		}
	}
	
	public void enQueue(int item){
		if(((rear +1) % size()) == front){
			System.out.println("Queue is full...");
			return;
		}else if (isEmpty()){
			front = rear = 0;
		}else{
			rear = (rear +1) % size();
		}
		array[rear] = item;
	}
	
	public void deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty...");
			return;
		}else if(front == rear){
			front = rear = -1;
		}else{
			front = (front + 1) % size();
		}
	}
	
	public int front(){
		return array[front];
	}
	
	public void displayQueue(){
		System.out.println("Queue values are : ");
		System.out.print("Front : "+front + " :rear: " +rear);
		for(int i : array){
			System.out.print(" "+i);	
		}
		System.out.println();
	}
	
	public int size(){
		return array.length;
	}

}
