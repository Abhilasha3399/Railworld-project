package p1;

import java.sql.Date;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = scan.nextLine();
		
		System.out.println("Enter the phoneno");
		int phoneno = scan.nextInt();
		
		System.out.println("Enter the date in DateTimeFormate---dd/MM/YYY--HH.mm.ss--E");
		String d1 = scan.nextLine();
		
		LocalDate d2=LocalDate.parse(d1);
		Date d3=Date.valueOf(d2);
		System.out.println(d3);
		
		//Person p1=new Person("Abhi",12,d3);
		
	}

}
