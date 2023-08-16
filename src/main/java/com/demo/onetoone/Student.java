package com.demo.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	int id;
	@Column
	int roll_no;
	@Column
	String name;
	@OneToOne(cascade = CascadeType.ALL)
	Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int roll_no, String name, Address address) {
		super();
		this.id = id;
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", roll_no=" + roll_no + ", name=" + name + ", address=" + address + "]";
	}

}
