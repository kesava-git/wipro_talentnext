package com.wipro.automobile.FourWheeler;
import com.wipro.automobile.Vehicle;

public class Ford extends Vehicle{
	private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    public Ford(String modelName, String registrationNumber, String ownerName,int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed=speed;
    }
	@Override
	public String getModelName() {
		return modelName;
	}

	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	@Override
	public String getOwnerName() {
		return ownerName;
	}
	public int getSpeed() {
		return speed;
	}
	public void tempControl() {
        System.out.println("Temperature control is active in Ford car.");
    }
}
