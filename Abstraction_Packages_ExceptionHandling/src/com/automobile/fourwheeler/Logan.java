package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private int speed;
	private int GPS;
	
	public Logan(String modelName, String registrationNumber, String ownerName, int speed,int GPS) {
		ModelName = modelName;
		RegistrationNumber = registrationNumber;
		OwnerName = ownerName;
		this.speed = speed;
		this.GPS=GPS;
	}
	public int speed() {
		return speed;
	}
	public int gps() {
		return GPS;
	}
	@Override
	public String getModelName() {
		return ModelName;
	}

	@Override
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}

	@Override
	public String getOwnerName() {
		return OwnerName;
	}
	
}
