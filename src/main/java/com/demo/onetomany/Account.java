package com.demo.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	@Column
	private int accountNumber;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountId, int accountNumber) {
		super();
		this.accountId = accountId;
		this.accountNumber = accountNumber;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + "]";
	}

}
