package com.railworld1;

import java.util.Objects;

public class Employee {
	 public int empId;
	 public String Name;
	 public int Age;
	 public String Gender;
	 
	 public Employee() {
		 
	 }

	
	 
	 public Employee(int empId, String name, int age, String gender) {
		super();
		this.empId = empId;
		Name = name;
		Age = age;
		Gender = gender;
	}



	public String info() {
		 return " empId is" + this.empId + " Name is "+ this.Name +" Age is " + this.Age + " Gender is" + this.Gender;
	 }

	@Override
	public int hashCode() {
		return Objects.hash(Age, Gender, Name, empId);
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
		return Objects.equals(Age, other.Age) && Objects.equals(Gender, other.Gender)
				&& Objects.equals(Name, other.Name) && empId == other.empId;
	}
	 
	 

	}
	 
	 


