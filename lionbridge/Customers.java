package com.lionbridge;

public class Customers {
	int accountNumber;
	int balanceBeginning;
	int totalItemsCharged;
	int  totalCredits;
	int creditLimit;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalanceBeginning() {
		return balanceBeginning;
	}
	public void setBalanceBeginning(int balanceBeginning) {
		this.balanceBeginning = balanceBeginning;
	}
	public int getTotalItemsCharged() {
		return totalItemsCharged;
	}
	public void setTotalItemsCharged(int totalItemsCharged) {
		this.totalItemsCharged = totalItemsCharged;
	}
	public int getTotalCredits() {
		return totalCredits;
	}
	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public int get newBalance() {
	if (newBalance = (balanceBeginning + totalItemsCharged - totalCredits ));
	return newBalance;
		
	}
	

}

