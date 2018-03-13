package main;

import java.util.Random;

public class Account {
	
	Random rand = new Random();
	
	private final int BALANCE = 500000, ACCOUNT_NUMBER = rand.nextInt(1000)+1;
	
	private int balance;

	public int getBalance() {
		return balance;
	}
	
	public int getAccountNumber( ) {
		return ACCOUNT_NUMBER;
	}
	
	public int credit (int credit) {
		balance = balance + credit;
		return balance;
	}
	
	public int debit (int debit) {
		balance = balance - debit;
		return balance;
	}
	
	public String toString() {
		return "A/C no : " + ACCOUNT_NUMBER + ", Balance = " + balance;
	}
	
	Account () {
		balance = BALANCE;
	}
	
	Account (int balance) {
		this.balance = balance;
	}
	
}
