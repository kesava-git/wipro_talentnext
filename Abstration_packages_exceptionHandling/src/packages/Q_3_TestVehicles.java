package packages;

import com.wipro.automobile.twowheeler.Hero;
import com.wipro.automobile.twowheeler.Honda;

public class Q_3_TestVehicles {
	public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "AP01AB1234", "Kesava",120);
        System.out.println("Hero Bike:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda("Honda City", "TS09XY5678", "narayana",140);
        System.out.println("Honda Car:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}
