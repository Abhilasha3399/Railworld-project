package Scanner;

public class Student {
 public String Name;
 public int rollno;
 public int age;
 public String Gender;
 
 public Student() {
	 
 }

public Student(String name, int rollno, int age, String gender) {
	super();
	Name = name;
	this.rollno = rollno;
	this.age = age;
	Gender = gender;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}

@Override
public String toString() {
	return "Student [Name=" + Name + ", rollno=" + rollno + ", age=" + age + ", Gender=" + Gender + "]";
}
 
 
 
 
}
