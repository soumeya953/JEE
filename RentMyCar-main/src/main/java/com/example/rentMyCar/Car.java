package com.example.rentMyCar;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule {
	private int numberOfSeats;
	
	public Car(int numberOfSeats) {
		super();
		this.setnumberOfSeats(numberOfSeats);
	}
	
	public Car() {
		super();
		
	}
	
	public Car(String plateNumber, String brand, int price,int numberOfSeats) {
		super(plateNumber,brand,price);
		this.setnumberOfSeats(numberOfSeats);
		
	}
	
	
	public int getnumberOfSeats() {
		return this.numberOfSeats;
	}
	
	public void setnumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public String toString() {
		return "Car [plateNumber=" + super.getPlateNumber() + ", brand=" + super.getBrand() + ", price=" + super.getPrice() + ", number of Seats =" + numberOfSeats + "]";
	}
	
}
