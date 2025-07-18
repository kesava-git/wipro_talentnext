package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle{
	private int speed;
	private String ModelName;
	private String RegistrationNumber;
	private String OwnerName;
	
	public Honda( String modelName, String registrationNumber, String ownerName,int speed) {
		this.speed = speed;
		ModelName = modelName;
		RegistrationNumber = registrationNumber;
		OwnerName = ownerName;
	}
	public int getSpeed() {
		return speed;
	}
	public void cdplayer() {
		System.out.println("CD player is ON in Honda car.");
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
