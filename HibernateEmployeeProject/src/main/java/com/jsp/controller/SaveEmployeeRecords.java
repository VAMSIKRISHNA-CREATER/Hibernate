package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;


public class SaveEmployeeRecords {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.print("Enter EmployeeID        :  ");	
		e.setEid(scan.nextInt());
		System.out.println();
		System.out.print("Enter EmployeeName      :  ");
		e.setEname(scan.next());
		System.out.println();
		System.out.print("Enter EmployeeAge       :  ");
		e.setEage(scan.nextInt());
		System.out.println();
		System.out.print("Enter EmployeeEmail     :  ");
		e.setEmail(scan.next());
		System.out.println();
		System.out.print("Enter EmployeePassword  :  ");
		e.setPassword(scan.next());
		EmployeeService res = new EmployeeService();
		Employee re = res.saveEmployeeRecordService(e);
		if(re!=null) {
			System.out.println("\nData is collected and saved successfully......!\n\n");
		}else {
			System.out.println("\nData not present...! \nSaving Record is not done .....!");
		}		
	}
}
