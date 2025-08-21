package com.practice_programs;

public class String_Palindrome {
	public static void main(String[] args) {
		String str = "Praseda11";
		String rev = new StringBuilder(str).reverse().toString();
		if (str.equals(rev)) {
			System.out.println("String is palindrome " + rev);
		}else {
			System.out.println("String is not palindrome " + rev);
		}
	} 
}
