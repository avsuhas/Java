package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper helper = new StringHelper();
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		}
	
	@Test
	public void test2(){
		StringHelper helper = new StringHelper();
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
		
	}
	
	@Test
	public void test3(){
		StringHelper helper = new StringHelper();
		assertEquals("CD",helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
	}

}
