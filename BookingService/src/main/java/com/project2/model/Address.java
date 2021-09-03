package com.project2.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Shivam Goel And Amarkant Sinha Sir
 *
 */


@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ZIPCODE")
	private int zipcode;	

	public Address() {
		// TODO Auto-generated constructor stub
	}

	
	public Address(String address, String city, String state, int zipcode) {
		super();
		//this.id=id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	
	public String getAddress() {
		return address;
	}

	
	public void setAddress(String address) {
		this.address = address;
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

	
	public int getZipcode() {
		return zipcode;
	}

	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
