package com.demo.onetomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EmpId;
	@Column
	private String email;
	@Column
	private String firstname;
	@Column
	private String lastname;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
	@JoinColumn
	Set<Account> accounts;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String email, String firstname, String lastname, Set<Account> accounts) {
		super();
		EmpId = empId;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accounts = accounts;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", email=" + email + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", accounts=" + accounts + "]";
	}
	
	

}
