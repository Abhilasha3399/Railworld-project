package com.railworld;

import java.util.Scanner;

import com.railworld.dao.EmployeeDao;
import com.railworld.dao.EmployeeDaoImpl;
import com.railworld.dao.EmployeeException;
import com.railworld.model.Employee;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employee Name");
		String eName = scan.next();
		
		System.out.println("Enter the age");
		int eAge = scan.nextInt();
		
		
		System.out.println("Enter the Salary");
		int eSalary = scan.nextInt();
		
		Employee emp=new Employee();
		emp.seteName(eName);
		emp.seteAge(eAge);
		emp.seteSalary(eSalary);
		
		//Dao
		//loose coupling
		
		EmployeeDao empDao=new EmployeeDaoImpl();
		
		try {
			
			String result = empDao.addEmployee(emp);
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		  // get Emplloyee By id
	      
	      System.out.println("Enter the id of employee");
	      int id = scan.nextInt();
	      
//	      
//	      // Dao 
	      
	       EmployeeDao empDao1 = new EmployeeDaoImpl();
	       
	         try {
			       Employee emp1 =	empDao.getEmpById(id);
			       System.out.println(emp);
			} catch (SQLException | EmployeeException e) {
					// TODO Auto-generated catch block
						e.printStackTrace();
					}
	         
			       


}}
