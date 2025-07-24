package packages;

import com.wipro.automobile.FourWheeler.Ford;
import com.wipro.automobile.FourWheeler.Logan;

public class Q_4_TestVehicles {
	public static void main(String[] args) {
		Logan logan = new Logan("Logan Sedan", "TS10CD9988", "Ravi",120);
        System.out.println("Logan Car:");
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Reg No: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.getSpeed());
        logan.gps();
        System.out.println();

        Ford ford = new Ford("Ford Endeavour", "KA03MN4567", "Priya",130);
        System.out.println("Ford Car:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Reg No: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.getSpeed());
        ford.tempControl();
	}
}
