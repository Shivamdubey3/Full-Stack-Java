package com.shivam.Dayfive;

public class Employee {
	//Employee Deatils
	private String employeeName;
	private int employeeID;
	private String Department;
	//superclass constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor Object
	public Employee(String employeeName, int employeeID, String department) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		Department = department;
	}
	//getter Setter
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeID=" + employeeID + ", Department=" + Department
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	

}
