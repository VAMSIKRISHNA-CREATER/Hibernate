package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

/* 
 * TO MAKE JAVA BEAN CLASS AS ENTITY CLASS 
 *    (1)  WE USE @Entity ANNOTATION [ WE WROTE THIS ONE, BEFORE THE CLASS NAME LINE]
 * 
 * IN HIBERNATE FRAMEWORK TECHNOLOGY WITHOUT PRIMARY KEY (PK) WE CAN NOT CREATE TABLE 
 *    (2)  WE USE @Id ANNOTATION FOR MAKING A FIELD AS PRIMARY KEY 
 *         (IN A TABLE WE CAN HAVE MAXIMUM ONLY ONE PRIMARY KEY )*/

@Entity
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private int eage;
	private String email;
	private String password;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
