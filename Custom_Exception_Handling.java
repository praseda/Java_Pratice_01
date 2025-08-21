package com.practice_programs;

import java.util.Scanner;

class InsufficientBalanceException extends  Exception{
	
	public InsufficientBalanceException() {
		System.out.println("Insuffient Balance");
	}
}

class ATM{
	private int balance = 50000;
//	int amount = 39000;
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount > balance) {
		throw new InsufficientBalanceException();
		}
		balance = balance - amount;
		System.out.println("Remaining Balance :" + balance);
	}
}

public class Custom_Exception_Handling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM b =  new ATM();
		
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		try {
			b.withdraw(amount);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
