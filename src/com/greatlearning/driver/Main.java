package com.greatlearning.driver;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		//AdminDepartment Class Object creation 
		AdminDepartment admindepartment = new AdminDepartment();
		admindepartment.departmentName();
		admindepartment.getTodaysWork();
		admindepartment.getWorkDeadline();
		admindepartment.isTodayAHoliday();
		System.out.println("");
		
		//HrDepartment Class Object creation
		HrDepartment hrdepartment = new HrDepartment();
		hrdepartment.departmentName();
		hrdepartment.doActivity();
		hrdepartment.getTodaysWork();
		hrdepartment.getWorkDeadline();
		hrdepartment.isTodayAHoliday();
		System.out.println("");
		
		//TechDepartment Class Object creation
		TechDepartment techdepartment = new TechDepartment();
		techdepartment.departmentName();
		techdepartment.getTodaysWork();
		techdepartment.getWorkDeadline();
		techdepartment.getTechStackInformation();
		techdepartment.isTodayAHoliday();
		System.out.println("");
	}
}
