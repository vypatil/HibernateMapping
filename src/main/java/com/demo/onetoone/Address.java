package com.demo.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	int id;
	@Column
	int pin_code;
	@Column
	String city;
	@Column
	String country;

	public Address() {
		super();

	}

	public Address(int id, int pin_code, String city, String country) {
		super();
		this.id = id;
		this.pin_code = pin_code;
		this.city = city;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPin_code() {
		return pin_code;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", pin_code=" + pin_code + ", city=" + city + ", country=" + country + "]";
	}

}
