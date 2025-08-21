package com.practice_programs;

public class Prime_Number {
	public static void main(String[] args) {
		int num = 5;
		boolean prime = true;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				prime = false;
				break;
			}
		}
		
		if (num <= 1) {
			prime = false;
		}
		
		if (prime) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}
}
