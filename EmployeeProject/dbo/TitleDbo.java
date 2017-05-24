package com.samson.dbo;

public class TitleDbo {

		int empNo;
		String title;
		String fromDate;
		String toDate;
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
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
			return "TitleDbo [empNo=" + empNo + ", title=" + title + ", fromDate=" + fromDate + ", toDate=" + toDate
					+ "]";
		}

		
}
