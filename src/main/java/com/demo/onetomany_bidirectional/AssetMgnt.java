package com.demo.onetomany_bidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ASSET_MHGT")
public class AssetMgnt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AM_ID", unique = true, nullable = false)
	private Long amId;

	
	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "EMP_ID")
	private Employee employee;
	
	@Column(name="ASSET_NAME")
	private String assetName;

	private String vendor;

	public Long getAmId() {
		return amId;
	}

	public void setAmId(Long amId) {
		this.amId = amId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "AssetMgnt [amId=" + amId + ", assetName=" + assetName + ", vendor=" + vendor + ", employee=" + employee
				+ "]";
	}

}
