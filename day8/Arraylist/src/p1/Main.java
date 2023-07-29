package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Person> arr=new ArrayList<>();
		
		arr.add(new Person("Abhilasha","female",24));
		arr.add(new Person("Archana","female",22));
		arr.add(new Person("Ankita","female",20));
		
		//simple for loop
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		//enhance for loop
		for(Person st:arr) {
			System.out.println(st);
		}
		arr.remove(2);
		
		//Iterator
		Iterator<Person> st1 = arr.iterator();
		while(st1.hasNext()) {
			System.out.println(st1.next());
			
		}
		
	}

}
