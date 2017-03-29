package com.samsonsoft.practice;

import java.util.Scanner;

public class Difference  {
	
	
	public static int  diff21(int a){
		
		return 21 - a;
		
	}
	
	
	
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = in.nextInt();
		if (n<=0 || n > 21)
			System.out.println("Cannot perform operation... N value should be greater than 0 and less than 21");
			
		else System.out.println("difference "+ diff21(n));
			
			
		
		
	}
	
	
	
	


}
