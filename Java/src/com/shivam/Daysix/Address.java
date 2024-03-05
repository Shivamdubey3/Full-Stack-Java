package com.shivam.Daysix;

public class Address {
	private String Street;
	private String City;
	private String State;
	private String postalCode;
	//constructor Object
	public Address(String street, String city, String state, String postalCode) {
		super();
		Street = street;
		City = city;
		State = state;
		this.postalCode = postalCode;
	}
	//constructor superclass
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	//getter setter
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	//To string
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", State=" + State + ", postalCode=" + postalCode + "]";
	}
	

	
	
	

}
