package com.example.rentMyCar;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{
	private int maxWeight;
	
	public Van() {
		super();
		
	}
	
	public Van(int maxWeight) {
		super();
		this.setMaxWeight(maxWeight);
		
	}
	
	public Van(String plateNumber, String brand, int price,int maxWeight) {
		super(plateNumber,brand,price);
		this.setMaxWeight(maxWeight);
		
	}
	
	public int getMaxWeight() {
		return this.maxWeight;
	}
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	@Override
	public String toString() {
		return "Van [plateNumber=" + super.getPlateNumber() + ", brand=" + super.getBrand() + ", price=" + super.getPrice() + ", max Weight=" + maxWeight + "]";
	}
	
	
}
