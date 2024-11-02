package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String studentID;
	private List<String> courses;

	/**
	 * @param name
	 * @param age
	 * @param studentID
	 */
	public Student(String name, int age, String studentID) {
		super();
		this.name = name;
		this.age = age;
		this.studentID = studentID;
		courses = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public void enrollCourse(String course) {
		courses.add(course);
		System.out.println("Student " + name + " is successfully enrolled for the course :" + course);
	}

	public void printStudentInfo() {
		System.out.println("********* Student Information *********");
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Enrolled Couses: " + courses);
	}
}
