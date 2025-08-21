package com.practice_programs;

import java.util.Scanner;

public class Number {
	public void display(int num) throws NegativeNumberException{
		if (num < 0){
		 throw new NegativeNumberException();	
		}
		else {
			System.out.println("Number is Positive :" + num);
		}
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		
		try {
			int num = sc.nextInt();
			Number n = new Number();
			n.display(num);
			} 
		catch(Exception e) {
			e.printStackTrace();
							}
	}
}
