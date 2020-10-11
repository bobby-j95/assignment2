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
	
	/*Default constructor
	 * Created by Behulum W
	 */
	public AccountHolder() {
		
	}
	/*Constructor with initial values
	 * Created by Robert J
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, 
			                 double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.sav = new SavingsAccount(savingsAccountOpeningBalance);
		this.check = new CheckingAccount(checkingAccountOpeningBalance);
	}
	
	/* Setter for first name
	 * created by behulum w
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/* getter for first name 
	 * created by behulum w
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/* Setter for middle name
	 * created by Robert J
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/* getter for middle name 
	 * created by Robert J
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	/* Setter for last name
	 * created by behulum w
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/* getter for last name 
	 * created by behulum w
	 */
	public String getlastName() {
		return lastName;
	}
	
	/* Setter for Social Security Number
	 * created by Robert J
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	/* getter for Social Security Number 
	 * created by Robert J
	 */
	public String getSSN() {
		return ssn;
	}
	
	/* getter for checking Account
	 * created by behulum w
	 */
	public CheckingAccount getCheckingAccount() {
		return check;
	}
	
	/* getter for saving Account
	 * created by Robert J
	 */
	public SavingsAccount addSavingsAccount(double openingBalance) {
		return sav;
	}
	
	/*value converter to string
	 * created by Robert J
	 */
	public String toString() {
		return("Name: " + firstName + " " + middleName + " " + lastName + "\n" + 
				"SSN: " + ssn + "\n" + 
				check.toString() + "\n" + 
				sav.toString());
	}
	//All private variables needed in the program
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	SavingsAccount sav = null;
	CheckingAccount check = null;
}