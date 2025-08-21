package com.practice_programs;

class University{
	String name;
	String location;
	
	public University(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	void show() {
		System.out.println("School Name :" + name);
		System.out.println("School Location :" + location);
	}
}

class Children extends University{
	String sname;
	int age;
	
	public Children(String sname, int age, String name, String location) {
		super(name, location);
		this.sname = sname;
		this.age = age;
	}
	
	@Override
	void show() {
		System.out.println("Student Name :" + sname);
		System.out.println("Student Age :" + age);
		System.out.println("School Name :" + name);
		System.out.println("School Location :" + location);
	}
}
public class Method_overiding {
public static void main(String[] args) {
	Children s = new Children("Praseda", 32, "CSA", "satara");
	s.show();
}
}
