package com.practice_programs;

import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class Exception_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Numbers:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int total = num1 / num2;
			System.out.println("Total : " + total);
		} catch (ArithmeticException e) {
			System.out.println("Not divisible by 0");
		} catch (InputMismatchException e) {
			System.out.println("Enter valid Number ");
		}
	}
	
}
