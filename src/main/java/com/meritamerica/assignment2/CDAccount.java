package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	private CDOffering offering = null;
	private Date startDate;
	private double balance;
	
	//*created by behulum w
	
	CDAccount(CDOffering offering, double balance){
		super(balance, offering.getInterestRate());
		this.offering = offering;
		this.startDate= new Date();
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return offering.getInterestRate();
	}
	
	public int getTerm() {
		return offering.getTerm();
	}
	
	public java.util.Date getStartDate(){
		return this.startDate;
	}

	// created by behulum w
	
	public long getAccountNumber() {
		return getAccountNumber();
	}
	
	public double futureValue(int years) {
		return (balance * Math.pow(1.0 + offering.getInterestRate(), offering.getTerm()));
		
		
	}
}