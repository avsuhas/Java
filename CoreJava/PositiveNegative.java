package com.samsonsoft.practice;

import java.util.Scanner;

public class PositiveNegative {

	public static boolean posNeg(int a, int b, boolean negative) {

		if ((a | b) < 0) {
			return true;
		} else if (a > 0 & b > 0) {
			return false;
		}
		return negative;
	}

	public static void main(String[] args) {
		
		int a;
		int b;
		boolean variable;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Entet the 2 integer and boolean value");
		a = in.nextInt();
		b = in.nextInt();
		variable = in.hasNext();
		System.out.println(posNeg(a,b,variable));	
		
	}

}
