package com.samson.sakilaproject.dbo;

public class CategoryDbo {
	
	int category_id;
	String name;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CategoryDbo [category_id=" + category_id + ", name=" + name + "]";
	}
	
}
