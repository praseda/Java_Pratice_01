package com.practice_programs;

public class Palindrome_Number {
	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int rev = 0;
		
		while(temp > 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp = temp / 10;
		}
		
		if (rev == num) {
			System.out.println(num + " is a palindrome number");
		} else {
			System.out.println(num + " is not a palindrome number");
		}
	}
}
