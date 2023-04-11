package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;

public class GetALlRecords {

	public static void main(String[] args) {
		Employee e = new Employee();
		EmployeeService res = new EmployeeService();
		List<Employee> list = res.getAllRecordsService(e);
		if(list.size()>0) {
			for(Employee emp : list) {
				System.out.println("\n\n-----------------------------------------------------\n\n");
				System.out.println("Employee Id                  :   "+emp.getEid());
				System.out.println("Employee Name                :   "+emp.getEname());
				System.out.println("Employee Age                 :   "+emp.getEage());
				System.out.println("Employee EmailID             :   "+emp.getEmail());
				System.out.println("Employee Password            :   "+emp.getPassword());
			}
		}else {
			System.out.println("Plz check yor Table........!");
		}
	}

}
