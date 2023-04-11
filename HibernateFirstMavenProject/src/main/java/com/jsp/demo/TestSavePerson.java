package com.jsp.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {
	public static void main(String[] args) {
		UsersTable ut = new UsersTable();
		ut.setId(3);
		ut.setName("balakrishna naik");
		ut.setAge(22);
		ut.setEmail("balanaik66@gmail.com");
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("vamsi1");
		EntityManager rem = remf.createEntityManager();
		EntityTransaction ret = rem.getTransaction();
		ret.begin();
		rem.persist(ut);
		ret.commit();
	}
}
