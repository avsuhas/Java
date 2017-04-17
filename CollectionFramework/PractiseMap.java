package com.samsonsoft.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PractiseMap {
	
	public static void main(String[] args){
		
		HashMap<Integer,String> hp = new HashMap<Integer,String>();
		
		Scanner in = new Scanner(System.in);
		int entry;
		System.out.println("Enter how many entries");
		entry = in.nextInt();
		
		for(int i=0; i<entry ; i++){
			System.out.println("Enter the key value");
			int temp = in.nextInt();
			System.out.println("Enter the name");
			String temp2 = in.next();
			
			hp.put(temp, temp2);
		}
		Set keyset=hp.keySet();
		
		for(int temp:hp.keySet())
		{
			System.out.println(temp+"  "+hp.get(temp));
		}
		
		
	
	}

}
