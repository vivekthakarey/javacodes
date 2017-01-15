package com.vivek.javageek.generics;

import java.util.Arrays;

public class Stack<T> {
	
	private int top = -1;
	private T[] stackArray = (T[]) new Object[5];
	private static Stack stack = null;
	
	private Stack(){}
	
	public static Stack getInstance(){
		if(stack == null){
			stack = new Stack();
		}
		return stack;
	}
	
	public void push(T item) throws StackException{
		if(top == stackArray.length - 1){
			throw new StackException("Stack is full");
		}
		stackArray[++top] = item;
	}
	
	public T peek() throws StackException{
		if(top == -1){
			throw new StackException("Stack is Empty");
		}
		return stackArray[top];
	}
	
	public T pop() throws StackException{
		if(top == -1){
			throw new StackException("Stack is Empty");
		}
		return stackArray[top--];
	}
	
	public void displayStackElements(){
		System.out.println(" Stack Elements are : "+Arrays.toString(stackArray));
	}

}
