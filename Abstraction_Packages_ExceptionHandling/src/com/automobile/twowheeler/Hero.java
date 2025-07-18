package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	private  int speed;
	
	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		ModelName = modelName;
		RegistrationNumber = registrationNumber;
		OwnerName = ownerName;
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void radio() {
		System.out.println("Radio is ON in Hero Bike.");
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
