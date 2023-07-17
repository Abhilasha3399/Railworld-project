package Scanner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Name =");
		String Name=scan.nextLine();
		
		System.out.println("Enter the roll.no =");
		int rollno=scan.nextInt();
		
		System.out.println("Enter the Age");
		int Age = scan.nextInt();
		
		System.out.println("Enter the Gender");
		String Gender = scan.next();
		
		Student s1=new Student();
		s1.setName(Name);
		s1.setRollno(rollno);
		s1.setAge(Age);
		s1.setGender(Gender);
		
		System.out.println(s1);
	}

}
