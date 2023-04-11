package com.jsp.services;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeService {
	public Employee saveEmployeeRecordService(Employee e) {
		return (new EmployeeDao()).saveEmployeeRecord(e);
	}
	public Employee getRecordByIdService(int pk) {
		return (new EmployeeDao()).getRecordById(pk);
	}
	public Employee deleteRecordByIdService(int pk) {
		return (new EmployeeDao()).deleteRecordById(pk);
	}
	public List<Employee> getAllRecordsService(Employee e){
		return (new EmployeeDao()).getAllRecords(e);
	}
	public Employee updateRecordService(Employee e) {
		return (new EmployeeDao()).updateRecord(e);
	}
	public List<Employee> employeeDetailsWithNameService(String name){
		return (new EmployeeDao()).employeeDetailsWithName(name);
	}
	public List<Employee> employeeDetailsWithNameSecondWayService(String name){
		return (new EmployeeDao()).employeeDetailsWithNameSecondWay(name);
	}
}
