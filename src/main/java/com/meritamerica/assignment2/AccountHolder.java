package com.meritamerica.assignment2;

import java.util.Arrays;
import com.meritamerica.assignment2.CheckingAccount;
import com.meritamerica.assignment2.SavingsAccount;

/*This program is the main account holder for the project.
 *This creates a checking and savings account for the user to withdraw and deposit money.
 *It calls the different to strings from each and outputs it all into one string.
 *It takes the full name, ssn, and beginning balance for checking
 *  and savings of the user as well for the unique bank account.
 * Created by Behulum W and Robert J
 */
public class AccountHolder {

	// All private variables needed in the program
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountBalance;
	private double savingsAccountBalance;
	private double cdAccountBalance;
	private int numberOfCDAccount;
	private int numberOfSavingsAccount;
	private int numberOfCheckingAccount;
	private double totalBalance;
	private SavingsAccount[] savingsAccount = new SavingsAccount[initSize];
	private CheckingAccount[] checkingAccount = new CheckingAccount[initSize];
	private CDAccount[] cdAccount = new CDAccount[initSize];
	private static int initSize = 5;

	/*
	 * Default constructor Created by Behulum W
	 */
	public AccountHolder() {

	}

	/*
	 * Constructor with initial values Created by Robert J
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.numberOfSavingsAccount = 0;
		this.numberOfCheckingAccount = 0;
		this.numberOfCDAccount = 0;
		this.cdAccountBalance = 0;
		this.checkingAccountBalance = 0;
		this.savingsAccountBalance = 0;
		this.totalBalance = 0;
	}

	/*
	 * Setter for first name created by behulum w
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * getter for first name created by behulum w
	 */
	public String getFirstName() {
		return firstName;
	}

	/*
	 * Setter for middle name created by Robert J
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/*
	 * getter for middle name created by Robert J
	 */
	public String getMiddleName() {
		return middleName;
	}

	/*
	 * Setter for last name created by behulum w
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * getter for last name created by behulum w
	 */
	public String getLastName() {
		return lastName;
	}

	/*
	 * Setter for Social Security Number created by Robert J
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	/*
	 * getter for Social Security Number created by Robert J
	 */
	public String getSSN() {
		return ssn;
	}

	/*
	 * Adds new Checking Account if the total is below $250,000 before adding for
	 * checking and savings combined. created by Robert J
	 */
	public CheckingAccount addCheckingAccount(double openingBalance) {
		CheckingAccount checking = new CheckingAccount(openingBalance);
		if (getCombinedBalance() < 250000) {
			checkingAccount[numberOfSavingsAccount] = checking;
			numberOfCheckingAccount++;
		} else {
			return null;
		}
		return checking;
	}

	/*
	 * Adds new Checking Account if the total is below $250,000 before adding for
	 * checking and savings combined. created by Robert J
	 */
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if (getCombinedBalance() < 250000) {
			this.checkingAccount[numberOfSavingsAccount] = checkingAccount;
			numberOfCheckingAccount++;
		} else {
			return null;
		}
		return checkingAccount;
	}

	/*
	 * getter for checking Account array created by Robert J
	 */
	public CheckingAccount[] getCheckingAccounts() {
		return checkingAccount;
	}

	/*
	 * getter for number of checking accounts created by Robert Johns
	 */
	public int getNumberOfCheckingAccounts() {
		return numberOfCheckingAccount;
	}

	/*
	 * getter for checking balance for all accounts together created by Robert J
	 */
	public double getCheckingBalance() {
		for (int x = 0; x < checkingAccount.length - 1; x++) {
			checkingAccountBalance += checkingAccount[x].getBalance();
		}
		return checkingAccountBalance;
	}

	/*
	 * Adds new Saving Account if the total is below $250,000 before adding for
	 * checking and savings combined. created by Robert J
	 */
	public SavingsAccount addSavingsAccount(double openingBalance) {
		SavingsAccount savings = new SavingsAccount(openingBalance);
		if (getCombinedBalance() < 250000) {
			savingsAccount[numberOfSavingsAccount] = savings;
			numberOfSavingsAccount++;
		} else {
			return null;
		}
		return savings;
	}

	/*
	 * Adds new savings account in the array of savings account created by Robert
	 * Johns
	 */
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if (getCombinedBalance() < 250000) {
			this.savingsAccount[numberOfSavingsAccount] = savingsAccount;
			numberOfSavingsAccount++;
		} else {
			return null;
		}
		return savingsAccount;
	}

	/*
	 * getter for saving Account array created by Robert J
	 */
	public SavingsAccount[] getSavingsAccounts() {
		return savingsAccount;
	}

	/*
	 * getter for number of savings accounts created by Robert Johns
	 */
	public int getNumberOfSavingsAccounts() {
		return numberOfSavingsAccount;
	}

	/*
	 * getter for saving balance for all accounts together created by Robert J
	 */
	public double getSavingsBalance() {
		for (int y = 0; y < savingsAccount.length - 1; y++) {
			savingsAccountBalance += savingsAccount[y].getBalance();
		}
		return savingsAccountBalance;
	}

	/*
	 * adds to cdAccount array if parameters of a new cdAccount are passed in
	 * created by Robert Johns
	 */
	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount cd = new CDAccount(offering, openingBalance);
		this.cdAccount[numberOfCDAccount] = cd;
		numberOfCDAccount++;
		return cd;
	}

	/*
	 * adds to cdAcount array if CDAccount class is the parameter created by Robert
	 * Johns
	 */
	public CDAccount addCDAccount(CDAccount cdAccount) {
		this.cdAccount[numberOfCDAccount] = cdAccount;
		numberOfCDAccount++;
		return cdAccount;
	}

	/*
	 * getter for cdAccount array created by Robert Johns
	 */
	public CDAccount[] getCDAccounts() {
		return cdAccount;
	}

	/*
	 * getter for number of CDAccounds created by Robert Johns
	 */
	public int getNumberOfCDAccounts() {
		return numberOfCDAccount;
	}

	public double getCDBalance() {
		for (CDAccount x : cdAccount) {
			cdAccountBalance += x.getBalance();
		}
		return cdAccountBalance;
	}

	
	/*
	 * getter for total balance for all accounts together created by Robert J
	 */
	public double getCombinedBalance() {
		totalBalance = checkingAccountBalance + savingsAccountBalance + cdAccountBalance;
		return totalBalance;
	}

}