package Abstraction_Packages_ExceptionHandling;
import com.automobile.fourwheeler.*;
public class Question_5_TestVehicle {
	public static void main(String[] args) {
		Logan logan=new Logan("Logan Delux", "AP39D1734", "Kesava", 100, 10110250);
		System.out.println("Logan Car: ");
		System.out.println("Model: "+logan.getModelName());
		System.out.println("Reg no: "+logan.getRegistrationNumber());
		System.out.println("Owner: "+logan.getOwnerName());
		System.out.println("Speed: "+logan.speed()+" km/h");
		System.out.println("GPS Location: "+logan.gps());
		System.out.println();
		Ford ford=new Ford("Ford Xtreme", "KA03NA0143","Narayana",80,25);
		System.out.println("Ford Car: ");
		System.out.println("Model: "+ford.getModelName());
		System.out.println("Reg no: "+ford.getRegistrationNumber());
		System.out.println("Owner: "+ford.getOwnerName());
		System.out.println("Speed: "+ford.speed()+" km/h");
		System.out.println("Temmperature Controlled to: "+ford.tempControl()+" degCelsius");
	}
}
