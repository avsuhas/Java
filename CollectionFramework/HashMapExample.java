package com.samsonsoft.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapExample {
	
	
	public static void printOccurances(List<Character> list) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 0;
		Character lowerCase;
		for(Character c : list){
			lowerCase = Character.toLowerCase(c);
			if(map.containsKey(lowerCase)){
				count = map.get(lowerCase);
				map.put(Character.toLowerCase(lowerCase), ++count);
			}
			else{
			   map.put(Character.toLowerCase(lowerCase), new Integer(1));	
			}
		}
		
		printMap(map);
	}
	
	
	private static void printMap(Map<Character, Integer> map) {
		Iterator<Character> iter = (Iterator<Character>) map.keySet().iterator();
		char c ;
		while(iter.hasNext()){
			c = iter.next();
			System.out.println("Occurance of Character "+ c + "  is n times: " + map.get(c) );
		
		}
		
		
	}
	
   public static void main(String[] args) {
	List<Character> list = new ArrayList<Character>();
	list.add('a');
	list.add('b');
	list.add('A');
	
	list.add('a');
	
	printOccurances(list);
	   
	   
}
}
