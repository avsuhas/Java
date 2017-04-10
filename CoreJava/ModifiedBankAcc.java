package com.samsonsoft.practice;

import java.util.Scanner;

public class BankAccount {
	private String accountName;
	private String accType;
	private int accNumber;
	private int accBalance;

	public void setValues(String accountName, String accType, int accNumber, int accBalance) {
		this.accountName = accountName;
		this.accType = accType;
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}

	public void deposit( int amount ){
			this.accBalance += amount;
	}
	
	public void withdraw(int amount) {
		if(this.accBalance > 0 && this.accBalance > amount) 
		this.accBalance -= amount;
		else
			System.out.println("Your current account balance is "+ this.accBalance + "withdra" );
			
			
	}
	
	public void display(){
		System.out.println(this.accountName);
		System.out.println(this.accBalance);
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accType=" + accType + ", accNumber=" + accNumber
				+ ", accBalance=" + accBalance + "]";
	}

	public static void main(String[] args){
		BankAccount b = new BankAccount();
		b.setValues("amit", "saving", 121, 1000);
		b.display();
		b.withdraw(500);
		b.display();
		
		BankAccount b1 = new BankAccount();
		System.out.println("Bankaccount object is " + b.toString());
		
		
		
	}
	
}
