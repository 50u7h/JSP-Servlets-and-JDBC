package com.guney.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {

		// create an empty list
		List<Student> students = new ArrayList<>();

		// add sample data
		students.add(new Student("Mary", "Public", "mary@guney.com"));
		students.add(new Student("John", "Doe", "john@guney.com"));
		students.add(new Student("Ajay", "Rao", "ajay@guney.com"));

		// return the list
		return students;
	}

}
