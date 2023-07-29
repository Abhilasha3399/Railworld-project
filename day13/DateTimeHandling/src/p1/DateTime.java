package p1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {
		
		LocalDate dt=LocalDate.now();
		System.out.println(dt);
		
		
		LocalTime dt1=LocalTime.now();
		System.out.println(dt1);
		
		LocalDateTime dt2=LocalDateTime.now();
		System.out.println(dt2);
		
		String s1= dt.format(DateTimeFormatter.ofPattern("dd-MM-YYY"));
		System.out.println(s1);
		
		String s2=dt2.format(DateTimeFormatter.ofPattern("YYY/MM/DD---HH:mm:ss--E"));
		System.out.println(s2);
	}

}
