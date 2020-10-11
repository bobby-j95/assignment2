package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	private CDOffering offering = new CDOffering();
	private int term;
	private Date startDate = new Date();
	private double balance;
	
	//*created by behulum w
	
	CDAccount(CDOffering offering, double balance){
		this.offering = offering;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		if (term==1) {
			return 1.8/100;
		}else if (term==2) {
			return 1.9/100;
		}else if (term==3) {
			return 2.0/100;
		}else if (term==5) {
			return 2.5/100;
		}else {
			return 2.2/100;
		}
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