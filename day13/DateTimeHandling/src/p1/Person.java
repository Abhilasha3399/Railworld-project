package p1;

import java.sql.Date;

public class Person {
	private String Name;
	private int phoneno;
	private Date date;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", phoneno=" + phoneno + ", date=" + date + "]";
	}
	
	
	

}
