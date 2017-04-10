package com.samsonsoft.practice;

import java.util.Scanner;

public class LargestInteger {

	public static int max1020(int a, int b) {

		if(a > b){
			if(a>=10 & a<=20)
				return a;
		}
		else if(b>=10 & b<=20)
			return b;
		
			return 0;
			}

	public static void main(String[] args) {

		int a;
		int b;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 2 integers");

		a = in.nextInt();
		b = in.nextInt();

		System.out.println("Largest Integer is "+max1020(a, b));

	}

}
