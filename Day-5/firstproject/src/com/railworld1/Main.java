package com.railworld1;

public class Main {
	public static void main(String[] args) {
		Employee e1=  new Employee(1, "Abhilasha",24, "female");
		Employee e2 =new Employee(1,"Abhilasha",24,"female");
		System.out.println(e1.info());
		System.out.println(e1==e2);
	}

}
