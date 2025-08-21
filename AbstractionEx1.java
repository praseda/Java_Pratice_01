package com.practice_programs;

abstract class Learners{
	String name;
	int age;
	
	public Learners(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	void show() {
		System.out.println("Student Name :  " + name);
		System.out.println("Stuent Age : "+ age);
	}
	
	abstract void display();
	
}

class Institute extends Learners {
	
	String SchoolName;
	
	public Institute(String SchoolName, String name, int age) {
		super(name, age);
		this.SchoolName = SchoolName;
	}
	
	void display() {
		System.out.println("School Name :" + SchoolName);
	}
}

public class AbstractionEx1 {
	public static void main(String[] args) {
		Learners sc = new Institute("CSE Satara", "Praseda", 22);
		sc.display();
		sc.show();
	}
	
}
