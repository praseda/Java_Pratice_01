package com.practice_programs;

public class Fibonnaci_Series {
public static void main(String[] args) {
	int num = 10;
	int first = 0;
	int second = 1;
	
	for (int i = 0; i < num; i++) {
		int next = first + second;
		System.out.println(next);
		first = second;
		second = next;
	}
}
}
