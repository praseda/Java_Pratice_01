package com.practice_programs;

public class Factorial_NUmber {
	public static void main(String[] args) {
		int num = 6;
		int factorial = 1;
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial  * i;
		}
		System.out.println("Fcatorial Number :" +factorial);
	}
}
