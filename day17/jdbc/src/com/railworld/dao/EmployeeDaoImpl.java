package com.railworld.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import  com.railworld.model.Employee;
import com.railworld.utility.jdbcConnection;

public class EmployeeDaoImpl implements EmployeeDao {
	private Connection con;
	  
	  
	  public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
		   this.con = jdbcConnection.getconnection();
	}

	@Override
	public String addEmployee(Employee emp) throws SQLException {
		 PreparedStatement ps=con.prepareStatement("INSERT INTO employee VALUES (?,?,?)");
		 
		 
		 ps.setString(1,emp.geteName());
		 ps.setInt(2,emp.geteAge() );
		 ps.setInt(3,emp.geteSalary());
		 
		 int x =   ps.executeUpdate();
		    
		    if(x > 0) {
		    	 return "data is saved in database";
		    }
			
			return "Not saved in the database";
		 
		
	}
	@Override
	public Employee getEmpById(int id) throws SQLException, EmployeeException {
		// TODO Auto-generated method stub
		
		  
		     PreparedStatement ps =   con.prepareStatement("SELECT * FROM employee e WHERE e.empId = ? ");
		     
		     ps.setInt(1, id);
		     
		       ResultSet  rs =    ps.executeQuery();
		       
		       
		     if( rs.next()) {
//		    	    int empId =   rs.getInt("empId");
//		    	     String name = rs.getString("eName");
//		    	      int age =  rs.getInt("eAge");
//		    	      int salary = rs.getInt("eSalary");
//		    	      
//		    	      
		    	  //  Employee emp =       new Employee(emp, name, age, salary);
		    	 
		    	 
		    	        
		    	      return  new Employee(rs.getInt("empId"), rs.getString("eName"),
		    	    		  rs.getInt("eAge"), rs.getInt("eSalary"));
		      }else {
		    	  throw new EmployeeException("There is no employee with this id : "+ id);
		      }
		      
		      
		
		
		
	}

	@Override
	public List<Employee> getAllEmp() throws SQLException, EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

}
