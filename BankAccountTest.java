package com.assignmentsjavaoopadvance;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount Kashaer =new BankAccount();
		BankAccount Kali =new BankAccount();
		BankAccount Kawser =new BankAccount();
		
		Kashaer.deposit("checking", 500.50).deposit("savings", 12.11);
		Kali.deposit("checking", 952.25).deposit("savings", 19.99);
		Kawser.deposit("checking", 325.95).deposit("savings", 3.30);
		Kashaer.withdraw("checking", 900).withdraw("savings",50);
		Kashaer.showInfo();
		Kali.showInfo();
		Kawser.showInfo();
		System.out.println(Kashaer.totalAmount());
		
		
		
	}

}
