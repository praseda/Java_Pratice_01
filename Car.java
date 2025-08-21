package com.practice_programs;


class Truck implements Vehicle{
	int TruckId;
	String TruckName;
	String TruckColor;
	double TruckNo;
	
	public Truck(int truckId, String truckName, String truckColor, double truckNo) {
		super();
		TruckId = truckId;
		TruckName = truckName;
		TruckColor = truckColor;
		TruckNo = truckNo;
	}
	
	public void Start() {
		System.out.println("Enter Truck Details :");
		System.out.println("Car Id :" + TruckId);
		System.out.println("Car Name :" + TruckName);
		System.out.println("Car Color :" + TruckColor);
		System.out.println("\n");

	}
	
	public void Stop() {
		System.out.println("Vehicle No :" +vecNo);
		System.out.println("Car No " + TruckNo);
	}
	
}

public class Car implements Vehicle{
	int CarId;
	String CarName;
	String CarColor;
	double CarNo;
	
	public Car(int CarId, String CarName, String CarColor, double CarNo) {
		this.CarId = CarId;
		this.CarName = CarName;
		this.CarColor = CarColor;
		this.CarNo = CarNo;
	}
	
	public void Start() {
		System.out.println(Vehicle.model);
		System.out.println(Vehicle.vecNo);
		System.out.println("\n");
		System.out.println("Enter Car Details :");
		System.out.println("Car Id :" + CarId);
		System.out.println("Car Name :" + CarName);
		System.out.println("Car Color :" + CarColor);
		System.out.println("\n");

	}
	
	public void Stop() {
		System.out.println("Vehicle No :" +vecNo);
		System.out.println("Car No " + CarNo);
		System.out.println("\n");

	}
	
	
	
	public static void main(String[] args) {
		Car c1 = new Car(3773, "Tiago", "Black", 83749328);
		c1.Start();
		
		Car c2 = new Car(7834, "Brezza", "White", 9384909);
		c2.Stop();
		
		Truck t1 = new Truck(83838, "jhdfj", "ndjsdjs", 732847);
		t1.Start();
		
		Truck t2 = new Truck(8378, "jfiuew", "hagywe", 92830);
		t2.Stop();
	}
}
