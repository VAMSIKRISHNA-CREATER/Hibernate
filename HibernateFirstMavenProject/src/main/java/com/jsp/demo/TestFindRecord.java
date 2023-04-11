package com.jsp.demo;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
public class TestFindRecord {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("vamsi1");
		EntityManager rem = remf.createEntityManager();
		System.out.print("Enter your id to get Details  :    ");
		int uin=sc.nextInt();
		UsersTable userTableRecord = rem.find(UsersTable.class,uin);
		if(userTableRecord!=null) {
			System.out.print("Person ID    : "+userTableRecord.getId());
			System.out.println();
			System.out.print("Person NAME  : "+userTableRecord.getName());
			System.out.println();
			System.out.print("Person AGE   : "+userTableRecord.getAge());
			System.out.println();
			System.out.print("Person EMAIL : "+userTableRecord.getEmail());
		}
	}

}
