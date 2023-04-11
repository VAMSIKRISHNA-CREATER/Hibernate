package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateRecord {
	public static void main(String[] args) {
		UsersTable ut = new UsersTable();
		ut.setId(2);
		ut.setName("RathodVarma");
		ut.setAge(23);
		ut.setEmail("krishnanbhai23@gmail.com");
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("vamsi1");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		UsersTable ut2 = rem.find(UsersTable.class,ut.getId());
		if(ut2!=null) {
			ret.begin();
			rem.merge(ut);
			ret.commit();
		}else {
			System.out.println("Plz check your details once.......");
		}
		
		
		
	}
}
