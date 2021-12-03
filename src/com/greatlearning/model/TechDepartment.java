package com.greatlearning.model;

public class TechDepartment extends SuperDepartment{
	
	//Variable Declaration
	String deptName = "Tech Department";
	String todaysWork = "Complete coding of Module 1";
	String workDeadline = "Complete by EOD";
	String stackInfo = "Core Java"; 
	
	//Method Implementation
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
	
	public String getTechStackInformation() {
		System.out.println(stackInfo);
		return stackInfo;
	}
}
