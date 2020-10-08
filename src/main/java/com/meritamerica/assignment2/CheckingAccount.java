package com.meritamerica.assignment2;

//Created by Behulum W
public class CheckingAccount {

	private double cBalance;

	public int years;

	private static final double INTEREST_RATE = .0001;

	public CheckingAccount(double openingBalance) {

		this.cBalance = openingBalance;

	}

	public double getBalance() {

		return cBalance;

	}

	public double getInterestRate() {

		return INTEREST_RATE;

	}

	public boolean withdraw(double amount) {
		
		if ((amount <= cBalance) && (amount >= 0)) {
			
			cBalance -= amount;
			
			return true;
			
		} else {
			
			return false;
			
		}
	}

	public boolean deposit(double amount) {
		
		if ((amount > 0)) {
			
			cBalance += amount;
			
			return true;
			
		} else {
			
			return false;
		}
	}

	public double futureValue(int years) {
		
		return (cBalance * (Math.pow((1 + INTEREST_RATE), years)));
		
	}

	//Created by Behulum W
	public String toString() {
		
		return ("Checking Account Balance: $" + getBalance() + "\n" + "Checking Account Interest Rate: "
		
				+ getInterestRate() + "\n" + "Checking Account Balance in 3 years: $" + futureValue(3));
		
	}

}