package com.samson;

import java.io.Serializable;

public class ActorBO implements Serializable{
	int id;
	String first_Name;
	String last_Name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	@Override
	public String toString() {
		return "ActorBO [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + "]";
	}
	
	
	

}
