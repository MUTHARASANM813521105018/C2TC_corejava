//Program to demonstrate TreeMap
package com.tnsif.dayeighteen.map;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

import com.tnsif.dayeight.interfaces.markerinterfaces.Student;

public class TreeMapDemo {

	public static void main(String[] args) {

		// Sorted Map - sort on keys
		TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
		courses.put("Core Java", 25);
		courses.put("Python", 30);
		courses.put("Hibernate", 6);
		courses.put("C++", 15);
		courses.put("Springboot", 15);
		courses.put("C++", 20);
		// courses.put(null,null); //RTE - null keys not allowed
		courses.put("HTML", null);

		System.out.println("Courses are : " + courses);

		// Adding user defined objects
		TreeMap<Student, String> students = new TreeMap<Student, String>();
		students.put(new Student(101, "Harshita", 67, null), "TY");
		students.put(new Student(102, "Sheetal", 72, null), "FY");
		students.put(new Student(104, "Pallavi", 71, null), "SY");
		students.put(new Student(103, "Anisha", 87, null), "BE");
		System.out.println(students);

		//Sort using Comparator object with Lambda Expression 
		Comparator<Student> comp = (s2,s1) -> (int) (s1.getId() - s2.getId());
		
		TreeMap<Student, String> t = new TreeMap<>(comp);
		t.put(new Student(101, "Harshita", 67, null), "TY");
		t.put(new Student(102, "Sheetal", 72, null), "FY");
		t.put(new Student(104, "Pallavi", 71, null), "SY");
		t.put(new Student(103, "Anisha", 87, null), "BE");
		System.out.println(t);
	}

}
