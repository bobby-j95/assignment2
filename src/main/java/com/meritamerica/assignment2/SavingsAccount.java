package com.meritamerica.assignment2;

/*Savings Account class for user
 * Created by Robert J
 */
public class SavingsAccount {

	// All constants needed in class
	private static final double INTEREST_RATE = .01;

	// Default constructor
	public SavingsAccount(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	// returns balance
	public double getBalance() {
		return openingBalance;
	}

	// returns interest rate
	public double getInterestRate() {
		return INTEREST_RATE;
	}

	// checks to see if amount is too much to be withdrawn or negative
	public boolean withdraw(double amount) {
		if ((amount <= openingBalance) && (amount >= 0)) {
			openingBalance -= amount;
			return true;
		} else {
			return false;
		}
	}

	// checks to see if amount is negative for deposit
	public boolean deposit(double amount) {
		if ((amount > 0)) {
			openingBalance += amount;
			return true;
		} else {
			return false;
		}
	}

	// gets future value after an amount of time in years
	public double futureValue(int years) {
		return (openingBalance * (Math.pow((1 + INTEREST_RATE), years)));
	}

	//outputs the values as a string when called
	public String toString() {
		return ("Savings Account Balance: $" + getBalance() + "\n" + "Savings Account Interest Rate: "
				+ getInterestRate() + "\n" + "Savings Account Balance in 3 years: $" + futureValue(3));
	}

	// All private variables needed in the program
	private double openingBalance;
}