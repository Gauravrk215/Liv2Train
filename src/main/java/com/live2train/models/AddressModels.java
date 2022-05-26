package com.live2train.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="address")
public class AddressModels {
	@Id
	@GeneratedValue
	private int id;
	
	@NotEmpty()
	public String Detailed_Address;
	
	@NotEmpty(message = "Must be filled.")
	public String City;
	
	@NotEmpty(message = "Must be filled.")
	public String State;
	
	@NotNull(message = "Must be filled.")
	public int Pincode;
	

//	Getter and Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetailed_Address() {
		return Detailed_Address;
	}

	public void setDetailed_Address(String detailed_Address) {
		Detailed_Address = detailed_Address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public AddressModels(int id, String detailed_Address, String city, String state, int pincode) {
		super();
		this.id = id;
		Detailed_Address = detailed_Address;
		City = city;
		State = state;
		Pincode = pincode;
	}

	public AddressModels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
