package com.practice_programs;

import java.util.Iterator;

public class Number_Reverse {
	public static void main(String[] args) {
		int num = 19392;
		int rev = 0;
		
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse Number :" + rev);
	} 
}
