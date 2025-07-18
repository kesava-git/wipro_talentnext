package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle{
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private int speed;
	private int tempControl;
	
	public Ford(String modelName, String registrationNumber, String ownerName, int speed,int tempControl) {
		ModelName = modelName;
		RegistrationNumber = registrationNumber;
		OwnerName = ownerName;
		this.speed = speed;
		this.tempControl=tempControl;
	}
	public int speed() {
		return speed;
	}
	public int tempControl(){
		return tempControl;
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
