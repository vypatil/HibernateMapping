package com.demo.onetomany_bidirectional;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final Long serialVersionUID = -4676860235903959769L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID", unique = true, nullable = false)
	private Long empId;

	private String name;

	private Long salary;

	private String department;

	@Column(name = "JOINED_ON")
	private Date joinedOn;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "employee", cascade = CascadeType.ALL)
	private List<AssetMgnt> assetMgnt;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getJoinedOn() {
		return joinedOn;
	}

	public void setJoinedOn(Date joinedOn) {
		this.joinedOn = joinedOn;
	}

	public List<AssetMgnt> getAssetMgnt() {
		return assetMgnt;
	}

	public void setAssetMgnt(List<AssetMgnt> assetMgnt) {
		this.assetMgnt = assetMgnt;
	}

	public static Long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", joinedOn=" + joinedOn
				+ ", assetMgnt=" + assetMgnt + "]";
	}

}
