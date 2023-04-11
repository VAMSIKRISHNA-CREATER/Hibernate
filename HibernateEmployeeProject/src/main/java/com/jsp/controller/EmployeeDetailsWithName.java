package com.jsp.controller;
import java.util.List;
import java.util.Scanner;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;
public class EmployeeDetailsWithName {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		EmployeeService res = new EmployeeService();
		System.out.print("Enter Emplyee Name :  ");
		String name = scan.next();
		System.out.println();
		List<Employee> list=res.employeeDetailsWithNameService(name);
		if(list.size()>0) {
			for(Employee emp:list) {
				System.out.println("\n\n-----------------------------------------------------\n\n");
				System.out.println("Employee Id                  :   "+emp.getEid());
				System.out.println("Employee Name                :   "+emp.getEname());
				System.out.println("Employee Age                 :   "+emp.getEage());
				System.out.println("Employee EmailID             :   "+emp.getEmail());
				System.out.println("Employee Password            :   "+emp.getPassword());
			}
		}else {
			System.out.println("Plz check DataResource once......!");
		}
	}
}
