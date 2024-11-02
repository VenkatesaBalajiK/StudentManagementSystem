package com.studentmanagement;

public class Main {

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
	}

}
