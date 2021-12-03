package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {
	
	//Variable Declaration
	String deptName = "Admin Department";
	String todaysWork = "Complete your documents submission";
	String workDeadline = "Complete by EOD";
	
	//Methods Implementation
	public String departmentName() {
		System.out.println("Welcome to "+deptName);
		return deptName;	
	}
	
	public String getTodaysWork() {
		System.out.println(todaysWork);
		return todaysWork;	
	}
	
	public String getWorkDeadline() {
		System.out.println(workDeadline);
		return workDeadline;		
	}
}
