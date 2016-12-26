package com.vivek.javageek;

import java.util.Scanner;

public class Stack {

	private static int arrIndex = 0;
	public static int [] array = new int [5];
	
	public static void main(String[] args) {
		System.out.println("Stack program starts here 1-Push, 2-Pop, 3-Print Stack, 4-Exit: ");
		int data = 0;
		Scanner scanner = new Scanner(System.in);
		outofSystemFlow : while(true){
			System.out.print("Enter Decision - ");
			try{
				data = Integer.parseInt(scanner.nextLine());
				System.out.println("");
			}catch(NumberFormatException ne){
				System.out.println("Please enter valid number");	
			}

			switch(data){
			case 1:
				if(arrIndex == array.length){
					System.out.println("Stack is full");
				}else{
					System.out.print("Enter Data :");
					data = Integer.parseInt(scanner.nextLine());
					System.out.println("");
					push(data);	
				}
				break;
			case 2 :
				int value = pop();
				if(value == -1){
					System.out.println("Stack is empty, please push data to retrieve");
				}else{
					System.out.println("Pop Value : "+value);	
				}
				break;
			case 3 :
				displayStack();
			case 4 :
				System.out.println("Thank you for visiting...");
				break outofSystemFlow;
			default : System.out.println("Please enter valid decision...");
			}			
		}
	}
	
	public static void push(int data){
		System.out.println("arrIndex push :: "+arrIndex);
		array[arrIndex] = data;	
		arrIndex++;
	}
	
	public static int pop(){
		System.out.println("arrIndex pop :: "+arrIndex);
		int returnval = -1;
		if(arrIndex == 0){
			System.out.println("Stack is empty");
		}else{
			arrIndex--;
			returnval = array[arrIndex];
			array[arrIndex] = 0;
		}
		return returnval;
	}
	
	public static void displayStack(){
		System.out.print("The stack values are : ");
		for(int arrayVal : array){
			System.out.print(arrayVal+",");
		}
		System.out.println("");
	}

}
