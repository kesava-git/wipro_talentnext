package com.wipro.automobile.twowheeler;
import com.wipro.automobile.Vehicle;
public class Honda extends Vehicle{
	private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    public Honda(String modelName, String registrationNumber, String ownerName,int speed) {
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
	public void cdplayer() {
        System.out.println("CD Player is turned ON in Honda car.");
    }
}
