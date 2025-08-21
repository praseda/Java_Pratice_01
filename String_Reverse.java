package com.practice_programs;

public class String_Reverse {
	public static void main(String[] args) {
		String str = "Praseda";
		String rev = " ";
		for(int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println("Reverse String " + rev);
	}
	
}
