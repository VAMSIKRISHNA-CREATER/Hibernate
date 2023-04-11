package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Employee;

/*     NOTE :--> 
 * ---------------
 *     IN DAO WE SHOULD AVOID PRINT() AND PRINTLN() STATEMENTS
 *     OBJECT CREATION STATEMENTS
 *     
 * */

public class EmployeeDao {
	public Employee saveEmployeeRecord(Employee e){
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		if(e!=null) {
			ret.begin();
			rem.persist(e);
			ret.commit();
		}
		return e;
	}
	
	
	
	/*
	 * getRecordById is public and non-static method
	 * It accepts one parameter of int type i.e PrimaryKey
	 * 
	 * */
	public Employee getRecordById(int pk) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		/* 
		 * (1) IT IS PUBLIC NON-STATIC METHOD.
		 * (2) PRESENT IN  EntityManager OBJECT.
		 * (3) IT ACCEPTS TWO PARAMETERS 
		 *     --> CLASS.java AS FIRST PARAMETER
		 *     --> INT VALUE (PRIMARY KEY) AS SEOND PARAMETER
		 * (4) IT RETURNS SOMETING WHICH OF CLASS.JAVA TYPE
		 *     i.e  IF IT ACCEPTS Employee.class AS FIRST ARGUMENT
		 *          THEN RETURN TYPE IS Employee
		 *          IF IT ACCEPTS Dept.class AS FIRST ARGUMENT
		 *          THEN RETURN TYPE IS Dept.
		 * */
		return rem.find(Employee.class,pk);
	}
	
	
	public Employee deleteRecordById(int pk) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		Employee emp = rem.find(Employee.class,pk);
		if(emp!=null) {
			ret.begin();
			rem.remove(emp);
			/* 
			 * remove(Object) IT IS A PUBLIC AND NON-STATIC METHOD
			 * PRESENT IN EntityManager's OBJECT REFERENCE VARIABLE. 
			 * USED TO DELETE THE OBJECTS.
			 * WHEN WE ARE USINIG THIS METHOD TO DELETE OBJECT 
			 * FIRST OF ALL WE NEED TO CHECK WEATHER OBJECT IS THERE ARE NOT
			 * FOR THAT PUSRPOSE WE USE ANOTHER METHOD i.e  find(CLASSNAME.class,INT)
			 * BASED ON THAT INT PARAMETER ( PRIMARY KEY ) WE ARE SEARCHING IN TABLE AND IF IT IS PRESENT
			 * THEN find() WILL RETURN THAT CLASS TYPE OBJECT .
			 * IF SEARCHING INT IS NOT PRESENT THEN IT WILL RETURN NULL.
			 * 
			 * */
			ret.commit();
		}
		return emp;
	}
	
	public List<Employee> getAllRecords(Employee e) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		Query qry = rem.createQuery("SELECT A FROM Employee A");
		List<Employee> records = qry.getResultList();
		return records;
	}
	
	
	
	public Employee updateRecord(Employee e) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		ret.begin();
		Employee emp = rem.merge(e);
		ret.commit();
		return emp;
	}
	
	
	public List<Employee> employeeDetailsWithName(String name) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		Query qry = rem.createQuery("select A from Employee A where ename=?1");
		qry.setParameter(1,name);
		return qry.getResultList();
		
	}
	
	
	public List<Employee> employeeDetailsWithNameSecondWay(String name) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("emp");
		EntityManager rem = remf.createEntityManager();
		Query qry = rem.createQuery("select A from Employee A where ename=:empname");
		qry.setParameter("empname",name);
		return qry.getResultList();
		
	}
	
	
}


















