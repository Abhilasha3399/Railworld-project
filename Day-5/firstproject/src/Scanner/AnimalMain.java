package Scanner;

import java.util.Scanner;

public class AnimalMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Age");
		int Age = scan.nextInt();
		
		System.out.println("Enter the Name");
		String Name = scan.next();
		
		System.out.println("Enter the Gender");
		String Gender = scan.next();
		
		System.out.println("Enter the colour");
		String colour = scan.next();
		
		Animal a1=new Animal();
		a1.setAge(Age);
		a1.setName(Name);
		a1.setGender(Gender);
		a1.setColour(colour);
		
		System.out.println(a1);
	}
}
