package com.practice_programs;


public class BankAccount {
	int balance = 50000;
	int amount = 5000;
	
	public void withdraw() throws InsufficientFundsException {
		if (amount >= balance) {
			throw new InsufficientFundsException();
		} else {
			balance = balance - amount;
			System.out.println("Amount Withdrawed : " + balance);
		}
	}
	
	public static void main(String[] args) {

		BankAccount b = new BankAccount();
		try {
			b.withdraw();
		} catch (InsufficientFundsException e) {
			System.out.println("balance is low ");
		}
	}
}
