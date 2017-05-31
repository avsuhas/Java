package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeated {
	
	public static void main(String[] args) {
		
		String a = "";
		System.out.println("Enter the string");
		Scanner in = new Scanner(System.in);
		a = in.nextLine();
		char c = findNonRepeat(a);
		System.out.println(c);
	}

	private static char findNonRepeat(String a) {
		
		int i;
		int length = a.length();
		Character c;
		Map<Character,Integer> characterMap = new HashMap<Character,Integer>();
		for(i=0;i<length;i++){
			c = a.charAt(i);
			if(characterMap.containsKey(c)){
				characterMap.put(c, characterMap.get(c)+1);
			}
			else
				characterMap.put(c, 1);
		}
		
		for(i=0; i<length ;i++){
			c = a.charAt(i);
			if(characterMap.get(c)==1)
				return c;	
		}
		return (Character) null;
	}

}
