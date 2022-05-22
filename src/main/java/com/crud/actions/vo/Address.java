package com.crud.actions.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_TBL")
public class Address {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "pin")
	private String pin;
	@Column(name = "details")
	private String details;

	public Address() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", pin=" + pin + ", details=" + details + "]";
	}

}
