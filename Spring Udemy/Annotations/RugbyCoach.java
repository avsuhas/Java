package com.samson;

import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "practice ball passing tricks";
	}

}
