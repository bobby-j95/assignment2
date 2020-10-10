package com.meritamerica.assignment2;

/*This is the main Bank Account class that will be extended to the other bank count classes:
 * SavingsAccount, CheckingAccount, and CDAccount
 * Created by: Robert Johns
 */
public class BankAccount {

	//first constructor without account number
	public BankAccount(double balance, double interestRate){
		
		this.balance = balance;
		this.interestRate = interestRate;

	}
	
	//second constructor with account number
	public BankAccount(long accountNumber, double balance, double interestRate){
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	//getter for account number
	public long getAccountNumber() {
		
		return this.accountNumber;
	}
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public double getInterestRate() {
		
		return this.interestRate;
	}
	
	//checks if amount can be withdrawn if its over balance or negative
	public boolean withdraw(double amount) {
		
		if ((amount <= balance) && (amount >= 0)) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
			
	}
	
	//checks if amount is negative
	public boolean deposit (double amount) {
		
		if ((amount > 0)) {
			balance += amount;
			return true;
		} else {
			return false;
		}
		
	}
	
	//returns the value of the account after a set amount of years
	public double futureValue(int years) {
		
		return (balance * (Math.pow((1 + interestRate), years)));
		
	}

	// All private variables needed in the program
		private double balance;
		private double interestRate;
		private long accountNumber;
}
