package com.samsonsoft.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurance {
	
	public static void getOccurance(List a){
		

        Object[] char_array = a.toArray();

    Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

        for (Object i : char_array) {

    charCounter.put((Character) i,charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);

        }

    for (Character key : charCounter.keySet()) {
  System.out.println("occurrence of '" + key + "' is  "+ charCounter.get(key));
			
    }
	}
	
	
	
	public static void main(String[] args){
		List<Character> a = new ArrayList<Character>();
		a.add('f');
		a.add('g');
		a.add('f');
		a.add('s');
		a.add('f');
		a.add('a');
		a.add('s');
		
		getOccurance(a);
		


		
	}

}
