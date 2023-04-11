package com.jsp.controller;

import java.util.Scanner;

import com.jsp.services.EmployeeService;

public class DeleteRecordById {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Employee ID  :   ");
		int pk=scan.nextInt();
		EmployeeService res = new EmployeeService();
		if(res.deleteRecordByIdService(pk)!=null) {
			System.out.println("Record is Deleted");
		}else {
			System.out.println("Plz check Employee ID once....!");
		}
	}
}
