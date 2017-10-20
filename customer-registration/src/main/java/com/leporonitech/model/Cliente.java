package com.leporonitech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue
	private Integer Id;
	
	private String name;

	private String address;

	private String email;

	private String city;

	private String state;

	private String country;

	private Boolean active;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String name, String address, String email, String city, String state, String country,
			Boolean active) {
		super();
		this.Id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.city = city;
		this.state = state;
		this.country = country;
		this.active = active;
	}

	

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
