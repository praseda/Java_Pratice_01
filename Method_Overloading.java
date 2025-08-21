package com.practice_programs;

class School{
	String name;
	String location;
	
	public School(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	void show(String name) {
		System.out.println("School Name :" + name);
		System.out.println("School Location :" + location);
	}
	
	void show(String name, int id) {
		System.out.println("School Id" + id);
	}
}

class Student extends School{
	String sname;
	int age;
	
	public Student(String sname, int age, String name, String location) {
		super(name, location);
		this.sname = sname;
		this.age = age;
	}
	
	void show() {
		System.out.println("Student Name :" + name);
		System.out.println("Student Age :" + age);
	}
}

public class Method_Overloading {
	public static void main(String[] args) {
		Student s = new Student("Praseda", 23, "CSA", "Satara");
		s.show();
	}
}
