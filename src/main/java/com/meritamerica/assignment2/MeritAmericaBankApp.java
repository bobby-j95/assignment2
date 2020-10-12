package com.meritamerica.assignment2;

/*
 * Main program created by Buhulum W and Robert Johns
 */
public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");

		// creating the 5 offerings
		CDOffering[] offerings = new CDOffering[5];

		offerings[0] = new CDOffering(1, 1.8 / 100);
		offerings[1] = new CDOffering(2, 1.9 / 100);
		offerings[2] = new CDOffering(3, 2.0 / 100);
		offerings[3] = new CDOffering(5, 2.5 / 100);
		offerings[4] = new CDOffering(10, 2.2 / 100);

		// Instantiate new accountHolder
		AccountHolder ah1 = new AccountHolder("John", "A.", "Doe", "555667777");

		CheckingAccount ch1 = new CheckingAccount(1000);
		SavingsAccount sv1 = new SavingsAccount(10000);

		CheckingAccount ch2 = new CheckingAccount(5000);
		SavingsAccount sv2 = new SavingsAccount(50000);

		CheckingAccount ch3 = new CheckingAccount(50000);
		SavingsAccount sv3 = new SavingsAccount(500000);

		CheckingAccount ch4 = new CheckingAccount(5000);
		SavingsAccount sv4 = new SavingsAccount(50000);

		// adding accounts
		ah1.addCheckingAccount(ch1);
		ah1.addSavingsAccount(sv1);

		ah1.addCheckingAccount(ch2);
		ah1.addSavingsAccount(sv2);

		ah1.addCheckingAccount(ch3);
		ah1.addSavingsAccount(sv3);

		ah1.addCheckingAccount(ch4);
		ah1.addSavingsAccount(sv4);

		// checks if part 4 wasn't printed
		System.out.println();
		System.out.println(
				"After: \n" + "Checking: $" + ah1.getCheckingBalance() + "\n" + "Savings: $" + ah1.getSavingsBalance());

		// getting best CD Offering
		MeritBank.setCDOfferings(offerings);
		ah1.addCDAccount(MeritBank.getBestCDOffering(ah1.getSavingsBalance() + ah1.getCheckingBalance()), 
				ah1.getSavingsBalance() + ah1.getCheckingBalance());
		
		//add account holder 1 to Merit Bank
		MeritBank.addAccountHolder(ah1);
		
		// Instantiate new accountHolder 2
		AccountHolder ah2 = new AccountHolder("Jane", "B", "Corl", "111223333");
		
		//adds a new checking and savings
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
		// getting best CD Offering
		MeritBank.setCDOfferings(offerings);
		ah2.addCDAccount(MeritBank.getSecondBestCDOffering(ah2.getCombinedBalance()), 
				ah2.getCombinedBalance());
		
		//add account holder 1 to Merit Bank
		MeritBank.addAccountHolder(ah2);
		
		//clearing offerings
		MeritBank.clearCDOfferings();
		
		// Instantiate new accountHolder 2
		AccountHolder ah3 = new AccountHolder("Bob", "L", "Hall", "777889999");
		
		/*ah3.addCDAccount(MeritBank.getSecondBestCDOffering(ah3.getCombinedBalance()), 
				ah3.getCombinedBalance());
		
		//checks to see if nothing was made from add CD Account
		System.out.println("\nCD Balance: " + ah3.getCDBalance() + "\n" + 
				"CD Term: " + ah3.getCDAccounts()[0].getTerm());
		*/
		
		//adds checking and savings value and adds it to account holders
		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);
		MeritBank.addAccountHolder(ah3);
		
		//prints total value from all accounts
		System.out.println("\nTotal from all accounts: " + MeritBank.totalBalances());
	}
}