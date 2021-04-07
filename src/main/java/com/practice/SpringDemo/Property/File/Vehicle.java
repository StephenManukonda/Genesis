package com.practice.SpringDemo.Property.File;

import org.springframework.beans.factory.annotation.Value;

public class Vehicle {

	// @Value("VW")
	@Value("${vehicle.brand}")
	private String brand;
	// @Value("polo")
	@Value("${vehicle.model}")
	private String model;
	// @Value("petrol")
	@Value("${vehicle.fuel.type}")
	private String fuelType;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String brand, String model, String fuelType) {
		super();
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void printData() {

		System.out.println("Brand is " + brand);
		System.out.println("model is " + model);
		System.out.println("fuel Type  is " + fuelType);
	}
}
