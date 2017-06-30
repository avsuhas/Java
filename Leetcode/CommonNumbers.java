package com.leetcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonNumbers {
	
	public void common(int[] a, int[] b){
	
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int i= 0; i<b.length; i++){
			for(int j=0; j<b.length; j++){
				
				 if (a[i] == b[j]){
					 set.add(a[i]);					 
				 }
			}
			
		}
	
		System.out.println("Common Numbers are"+ set);
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = {3,2,3,7,9};
		
		CommonNumbers cn = new CommonNumbers();
		cn.common(a , b);
		
		
	}

}
