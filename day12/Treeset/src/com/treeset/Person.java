package com.treeset;

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	
	private int Salary;
	
	
	Person(){
		
	}

	public Person(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}



	@Override
	public int compareTo(Person o) {
		
		return this.id-o.id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	

	
	

}
