package com.shivam.Daysix;

public class Person {
	private String name;
	private String Address;
	
	//constructor Object
	public Person(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}
	

	//superclass constructor
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	//TO String
	@Override
	public String toString() {
		return "Person [name=" + name + ", Address=" + Address + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
