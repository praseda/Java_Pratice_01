package com.practice_programs;

public class Encapsulation1 {
	private  String name;
	private static int age;
	
	public void setName(String name) {
		this.name = name;
}
	public String getName() {
		return name;
	}                      
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Encapsulation1 e = new Encapsulation1();
		e.setName("Praseda Barge");
//		e.getName();
		
		e.setAge(23);
		e.getAge();
		
		System.out.println(		e.getName());
		System.out.println(age);
		
	}
}
