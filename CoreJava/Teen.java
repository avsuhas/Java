package com.samsonsoft.practice;

import java.util.Scanner;

public class Teen {
	

	public static boolean hasTeen (int a, int b, int c) {
		
		if(a >=13 && a<=19)
		{
			return true;
		}
		if(b >=13 && b<=19)
		{
			return true;
		}
		if(c >=13 && c<=19)
		{
			return true;
		}
		else
		return false;
		
	}

 public static void main(String [] args){
		
	 int a,b,c;
	 
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the value of a");
	  a = in.nextInt();
	 
	 System.out.println("Enter the value of b");
	  b = in.nextInt();
	
	 System.out.println("Enter the value of c");
	  c = in.nextInt();
		
	  System.out.println("Teen"+ hasTeen(a,b,c));
		
		
	
			
		}
		
		
			
	}
	

