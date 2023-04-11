package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;

public class GetRecordById {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		EmployeeService res = new EmployeeService();
		System.out.print("Enter Employee ID :   ");
		Employee record = res.getRecordByIdService(scan.nextInt());
		if(record!=null) {
			System.out.print("Employee ID       :    "+record.getEid());
			System.out.print("\nEmployee Name     :    "+record.getEname());
			System.out.print("\nEmployee Age      :    "+record.getEage());
			System.out.print("\nEmployee EmailID  :    "+record.getEmail());
			System.out.print("\nEmployee Password :    "+record.getPassword());
		}else {
			System.out.println("Plz Check Your DataResource Once");
		}
	}

}
