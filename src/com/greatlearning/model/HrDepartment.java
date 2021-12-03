package com.greatlearning.model;

public class HrDepartment extends SuperDepartment{
	
	//Variable Declaration
	String deptName = "HR Department";
	String todaysWork = "Fill today’s timesheet and mark your attendance";
	String workDeadline = "Complete by EOD";
	String doActivity = "team Lunch";
	
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
	
	public String doActivity() {
		System.out.println(doActivity);
		return doActivity;		
	}
}
