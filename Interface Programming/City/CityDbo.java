package com.samson.sakilaproject.dbo;

public class CityDbo {
	int city_id;
	String city;
	int country_id;
	
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	@Override
	public String toString() {
		return "CityDbo [city_id=" + city_id + ", city=" + city + ", country_id=" + country_id + "]";
	}
	
}
