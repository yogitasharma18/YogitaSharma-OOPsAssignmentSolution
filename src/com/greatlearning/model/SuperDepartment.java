package com.greatlearning.model;

public class SuperDepartment {
	
	// Variable Declaration
	String deptName = "Super Department";
	String todaysWork = "No Work as of now";
	String workDeadline = "Nil";
	String isTodayHoliday = "Today is not a Holiday";
	
	// Method Implementation
	public String departmentName() {
		return deptName;	
	}
	
	public String getTodaysWork() {
		return todaysWork;	
	}
	
	public String getWorkDeadline() {
		return workDeadline;		
	}
	
	public String isTodayAHoliday() {
		System.out.println(isTodayHoliday);
		return isTodayHoliday;		
	}
}
