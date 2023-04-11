package com.jsp.controller;

import com.jsp.dto.Employee;
import com.jsp.services.EmployeeService;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class UpdateRecord {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		Employee e = new Employee();
		EmployeeService res = new EmployeeService();
		System.out.print("Enter EmployeeID        :  ");
		int id=scan.nextInt();
		if(rem.find(Employee.class,id)!=null) {
			e.setEid(id);
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
			Employee emp = res.updateRecordService(e);
			if(emp!=null) {
				System.out.println("DATA is updated ........!");
			}else {
				System.out.println("DATA is updation is not done yet......... Invalid PK .........!q");
			}
		}else {
			System.out.println("Invalid EmployeeID");
		}
	}

}
