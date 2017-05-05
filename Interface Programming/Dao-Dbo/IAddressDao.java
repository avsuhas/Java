package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.AddressDbo;

public interface IAddressDao {

	public	List<AddressDbo> findAll();
	public AddressDbo findById(int a);
	public int insert(AddressDbo addressDbo);
}
