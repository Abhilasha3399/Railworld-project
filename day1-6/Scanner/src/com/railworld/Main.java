package com.railworld;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Abhilasha","female",23000);
		//Employee e2=new Employee(2,"Archana","female",25000);
		Employee e3=new Employee(1,"Abhilasha","female",23000);
		
		//System.out.println(e1==e2);
		System.out.println(e1==e3);
		System.out.println(e1.equals(e3));
		System.out.println(e1);
		
	}

}
