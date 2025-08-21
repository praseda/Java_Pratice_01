package com.practice_programs;

public interface Vehicle {
	int vecNo = 502;
	String model = "tata";
	
	void Start();
	
	void Stop();
	
	public static void main(String[] args) {
		System.out.println("Vehicle Number :" + vecNo);
		System.out.println("Vehicle Model :" + model);
	}
	
}
