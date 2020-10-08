package com.meritamerica.assignment2;

//created by behulum w 
public class CDOffering {
	
private double interestRate;
private int term;

public CDOffering(int term, double interestRate) {
	

		this.interestRate = interestRate;
		
		this.term = term;	
		
		switch(term) {
		case 1:
			interestRate = 0.018;
			break;
		case 2:
			interestRate = 0.019;
			break;
		case 3:
			interestRate = 0.020;
			break;
		case 5:
			interestRate = 0.025;
			break;
		case 10:
			interestRate = 0.022;
			break;
		}

}
