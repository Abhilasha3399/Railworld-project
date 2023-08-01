package com.railworld.model;

public class Employee {
	private int empid;
	private String eName;
	private int eAge;
	private int eSalary;
	public int getEmpid() {
		return empid;
	}
	
	
	public Employee(int empid, String eName, int eAge, int eSalary) {
		super();
		this.empid = empid;
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", eName=" + eName + ", eAge=" + eAge + ", eSalary=" + eSalary + "]";
	}
	

}
