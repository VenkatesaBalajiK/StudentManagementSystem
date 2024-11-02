package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

import exceptions.StudentNotFoundException;

public class Main {
	static List<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {
		System.out.println("********* Welcome to Student Management System *********");
		Student s1 = new Student("Bala", 20, "143");
		Student s2 = new Student("Balaji", 21, "144");
		Student s3 = new Student("Balu", 22, "145");

		s1.enrollCourse("Selenium");
		s1.enrollCourse("Java");
		s1.enrollCourse("SQL");
		s1.printStudentInfo();

		s2.enrollCourse("MySQL");
		s2.printStudentInfo();

		s3.enrollCourse("PL - SQL");
		s3.printStudentInfo();

		students.add(s1);
		students.add(s2);
		students.add(s3);

		try {
			findStudentById("147");
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static Student findStudentById(String studentID) throws StudentNotFoundException {

		for (Student student : students) {
			if (student.getStudentID().equals(studentID)) {
				System.out.println("Student with ID [" + studentID + "] is found");
				return student;
			}
		}
		throw new StudentNotFoundException("Student with ID [" + studentID + "] not found");
	}

}
