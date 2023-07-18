package com.railworld;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Enter the name");
		String Name = scan.next();
		
		System.out.println("Enter the Gender");
		String Gender = scan.next();
		
		System.out.println("Enter the Age");
		int Age = scan.nextInt();
		
		Person p1=new Person();
		p1.setName(Name);
		p1.setGender(Gender);
		p1.setAge(Age);
		
		System.out.println(p1);
		
		Animal a1=new Dog();
		a1=new Cat();
		a1=new Elephent();
		a1.Eat();
		a1.sleep();
		a1.walk();
		
	}
	

}
