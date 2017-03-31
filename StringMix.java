package com.samsonsoft.practice;

import java.util.Scanner;

public class StringMix {

	public static boolean mixStart(String str) {

		

		String mix = "ix";
		if (str.startsWith(mix, 1))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		String s1 = " ";

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		s1 = in.nextLine();

		System.out.println(mixStart(s1));

	}
}
