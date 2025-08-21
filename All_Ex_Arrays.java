package com.practice_programs;

import java.util.Iterator;
import java.util.Scanner;

public class All_Ex_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");	// Declares the size of array
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array ");	//add elements in array
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Entered Elements in array");	//prints all elements in array
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		int sum = 0;				//sum of all elements in array
		for(int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		int total[] = new int[n];	//Addition of two arrays
		int arr2[] = {6,7,8,9,10};
		for(int i = 0; i < n; i++) {
			total[i] = arr[i] + arr2[i];
			System.out.println("addition is "+total[i]);

		}
		
		int sum1 = 0;			//sum of all elements in array	
		for(int i = 0; i < n; i++ ) {
			sum1 = sum1 + arr2[i];
		}

//		largest/smallest value in array
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
	System.out.println("\n");
	System.out.println(max +"and" + min);
		
		for(int i = 0; i < n; i++) {
			if (arr2[i] > max) {
				max = arr2[i];
			}
			if (arr2[i] < min) {
				min = arr2[i];
			}
		}
		System.out.println("\n");
		System.out.println(max +"and" + min);
		
//		reverse an array
		for(int i = n - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		for(int i = n-1; i >= 0; i--) {
			System.out.print(arr2[i]);
		}
	}
}
