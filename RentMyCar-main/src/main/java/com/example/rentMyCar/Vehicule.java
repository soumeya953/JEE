package com.example.rentMyCar;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity 
@DiscriminatorColumn(name="type_Vehicule", discriminatorType=DiscriminatorType.STRING)
public class Vehicule {
	private String plateNumber;
	private String brand;
	private int price;
	private boolean rented; 
	private Dates dates;

	
	public Vehicule() {
		super();
	}
	
	public Vehicule(String plateNumber, String brand, int price) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.price = price;
		
	}
	
	@Id
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@OneToOne(mappedBy="vehicule" , cascade= CascadeType.ALL)
	public Dates getDates() {
		return dates;
	}

	public void setDates(Dates dates) {
		this.dates = dates;
	}

	
	
	
	
	
		
	@Override
	public String toString() {
		return "Vehicule [plateNumber=" + plateNumber + ", brand=" + brand + ", price=" + price + "]";
	}

}
