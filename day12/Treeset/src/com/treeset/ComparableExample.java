package com.treeset;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	public static void main(String[] args) {
		ArrayList<Person>e1=new ArrayList<>();
		e1.add(new Person(1,"Archana",1200000));
		e1.add(new Person(4,"Abhilasha",1230000));
		e1.add(new Person(3,"Ankita",1234444));
		
		System.out.println(e1);
		Collections.sort(e1);
		
		//After Comparable
		System.out.println(e1);
	}

}
