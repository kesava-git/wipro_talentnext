package Abstraction_Packages_ExceptionHandling;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
public class Question_4_TestVehicles {
	public static void main(String[] args) {
		Hero heroBike = new Hero("Hero Splendor", "KA01AB1234", "Rahul", 85);
        System.out.println("Hero Bike:");
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed() + " km/h");
        heroBike.radio();

        System.out.println();

        // Test Honda
        Honda hondaCar = new Honda("Honda City", "MH02CD5678", "Priya", 120);
        System.out.println("Honda Car:");
        System.out.println("Model: " + hondaCar.getModelName());
        System.out.println("Reg No: " + hondaCar.getRegistrationNumber());
        System.out.println("Owner: " + hondaCar.getOwnerName());
        System.out.println("Speed: " + hondaCar.getSpeed() + " km/h");
        hondaCar.cdplayer();
	}
}
