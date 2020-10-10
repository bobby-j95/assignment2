package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	public CDOffering offering = new CDOffering();
	public int term;
	public Date startDate = new Date();
	
	//*created by behulum w
	
	CDAccount(CDOffering offering, double balance){
		this.offering = offering;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public int getTerm() {
		return this.term;
	}
	
	public java.util.Date getStartDate(){
		return this.startDate;
	}
	
	// created by behulum w
	
	public long getAccountNumber() {
		return this.getAccountNumber();
	}
	
	public double futureValue(int years) {
		futureBalance = (balance * Math.pow(1.0 + getInterestRate(), years));
		return futureBalance;
		
	}
}