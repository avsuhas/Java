package com.samson.sakilaproject.dbo;

public class AddressDbo {
	
	int address_id;
	String address;
	String district;
	int city_id;
	int postal_code;
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public int getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}
	@Override
	public String toString() {
		return "AddressDbo [address_id=" + address_id + ", address=" + address + ", district=" + district + ", city_id="
				+ city_id + ", postal_code=" + postal_code + "]";
	}

}
