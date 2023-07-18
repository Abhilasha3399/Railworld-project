package com.railworld;

import java.util.Objects;

public class Employee {
	public int Id;
	public String Name;
	public String Gender;
	public int Salary;
	
	Employee(){
		
	}

	public Employee(int id, String name, String gender, int salary) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Salary = salary;
	}
	
	

	
	@Override
	public int hashCode() {
		return Objects.hash( Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Gender, other.Gender) && Id == other.Id && Objects.equals(Name, other.Name)
				&& Salary == other.Salary;
	}

	
	
	
	
	

}
