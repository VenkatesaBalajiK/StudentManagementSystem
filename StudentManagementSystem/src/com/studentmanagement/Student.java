package com.studentmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		if (validateAge(age) && validateStudentName(name) && validateStudentID(studentID)) {
			this.name = name;
			this.age = age;
			this.studentID = studentID;
			courses = new ArrayList<String>();
		}
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
		if (validateCourses(course)) {
			if (!courses.contains(course)) {
				courses.add(course);
				System.out.println("Student " + name + " is successfully enrolled for the course :" + course);
			} else {
				System.err.println("Student " + name + " is already enrolled for the course :" + course);
			}
		}
	}

	public void printStudentInfo() {
		System.out.println("********* Student Information *********");
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Enrolled Couses: " + courses);
	}

	private boolean validateAge(int age) {
		if (age >= 15 && age <= 60) {
			return true;
		} else {
			System.err.println("Invaild Age !!. Please enter the age between 15 to 60");
			return false;
		}
	}

	private boolean validateStudentName(String studentName) {
		String regexPattern = "^[a-zA-Z\\s]+$";
		Pattern stdNameCompile = Pattern.compile(regexPattern);
		Matcher stdNameMatcher = stdNameCompile.matcher(studentName);

		if (stdNameMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invaild Name !!. Please enter the valid name");
			return false;
		}
	}

	private boolean validateStudentID(String studentID) {
		String stdIDPattern = "S-\\d+$";
		Pattern stdIDCompile = Pattern.compile(stdIDPattern);
		Matcher stdIDMatcher = stdIDCompile.matcher(studentID);

		if (stdIDMatcher.matches()) {
			return true;
		} else {
			System.err.println("Invaild ID !!. Please enter the valid ID");
			return false;
		}
	}

	private boolean validateCourses(String course) {
		course = course.toLowerCase();
		String courses[] = { "java", "dsa", "devops" };

		if (Arrays.asList(courses).contains(course)) {
			return true;
		} else {
			System.err.println("Invaild course !!. Please enter anyone from following :" + Arrays.toString(courses));
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentID=" + studentID + ", courses=" + courses + "]";
	}

}
