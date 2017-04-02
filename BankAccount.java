package com.samsonsoft.practice;

import java.util.Scanner;

public class BankAccount {

	static String AccountName;
	String AccountType;
	int AccountNumber;
	static int AccountBalance;

	public static void set_values() {

		BankAccount ba = new BankAccount();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name");
		ba.AccountName = in.nextLine();

		System.out.println("Enter the type of account");
		ba.AccountType = in.nextLine();

		System.out.println("Enter the type of account-number");
		ba.AccountNumber = in.nextInt();
		
		System.out.println("Enter the initial amount to the account");
		BankAccount.AccountBalance = in.nextInt();
		
		System.out.println("Entered Account details");
		System.out.println(ba.AccountName);
		System.out.println(ba.AccountType);
		System.out.println(ba.AccountNumber);
		System.out.println(ba.AccountBalance);
		
	}

	public static void deposit_amount(int amount) {
		BankAccount.AccountBalance += amount;
		System.out.println("Account balance = " + AccountBalance);
	}

	public static void withdraw_amount(int amount) {
		BankAccount.AccountBalance -= amount;
		System.out.println("Account balance = " + AccountBalance);
	}

	public static void name_balance() {

		System.out.println("Account Name is "+ AccountName);
		System.out.println("The balance is the account is "+ AccountBalance);
	}

	public static void main(String[] args) {

		int a;
		int b;
		set_values();
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the deposit amount");
		a = in.nextInt();
		deposit_amount(a);
		
		System.out.println("enter the withdraw amount");
		b = in.nextInt();
		withdraw_amount(b);
		
		name_balance();
		

	}

}