package com.jsp.demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Person1 {
	public static void main(String[] args) {
		EntityManagerFactory remf = Persistence.createEntityManagerFactory("vamsi1");     
		System.out.println(remf);
	}
}
