package com.samson.dbo;

public class DeptEmpDbo {

		int empNo;
		int deptNo;
		String fromDate;
		String toDate;
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public int getDeptNo() {
			return deptNo;
		}
		public void setDeptNo(int deptNo) {
			this.deptNo = deptNo;
		}
		public String getFromDate() {
			return fromDate;
		}
		public void setFromDate(String fromDate) {
			this.fromDate = fromDate;
		}
		public String getToDate() {
			return toDate;
		}
		public void setToDate(String toDate) {
			this.toDate = toDate;
		}
		@Override
		public String toString() {
			return "DeptEmpDbo [empNo=" + empNo + ", deptNo=" + deptNo + ", fromDate=" + fromDate + ", toDate=" + toDate
					+ "]";
		}
		
	
}
