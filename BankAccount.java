package com.assignmentsjavaoopadvance;
import java.util.Random;

public class BankAccount {
	
	private  String accountNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	private static int numberOfAccounts = 0;
	private static double totalDeposit = 0;

private  String genAccountNumber() {
	return ("" + Math.random()). substring( 2,   12);	
}
public BankAccount() {
	this.accountNumber = genAccountNumber();
	this.numberOfAccounts++;
}
public double getBalance(String type) {
	if (type =="checking") {
		return this.checkingBalance;
	}else if (type == "savings") {
		return this.savingsBalance;	
	}else {
		return 0;
	}
}
public BankAccount deposit(String type, double amount) {
	if (type =="checking") {
		 this.checkingBalance += amount;
	}else if (type == "savings") {
		 this.savingsBalance += amount;
	}
	this.totalDeposit += amount;
		return this;
	}

public BankAccount withdraw(String type, double amount) {
	if(type == "checking") {
		if(amount > this.checkingBalance) {
			System.out.println("Insufficient Balance!");
		}else {
			System.out.println("$" + amount +" withdrawn!");
			this.totalDeposit -= amount;
			this.checkingBalance -= amount;
		}
	}else if (type == "savings") { 
		if(amount > this.savingsBalance) {
			System.out.println("Insufficient Balance!");
		}else {
			System.out.println("$"+ amount + "withdrawn!");
			this.totalDeposit -= amount;
			this.savingsBalance -=amount;
		}
	}
	return this;
}


public double totalAmount() {
	return this.totalDeposit;
}
public void showInfo() {
	System.out.println("Account number:" + this.accountNumber);
	System.out.println("Checking Balance:$" + this.checkingBalance);
	System.out.println("Savings Balance:$" + this.savingsBalance);
}

}








