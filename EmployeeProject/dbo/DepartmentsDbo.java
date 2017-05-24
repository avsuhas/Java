package com.samson.dbo;

public class DepartmentsDbo {
	
	String deptNumber;// taking string because in db it's 
	//not integer
	String deptName;
	public String getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(String deptNumber) {
		this.deptNumber = deptNumber;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Departments [deptNumber=" + deptNumber + ", deptName=" + deptName + "]";
	}
	

}
