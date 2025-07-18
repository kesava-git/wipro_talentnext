package Abstraction_Packages_ExceptionHandling;

import java.util.Random;

public class Question_1_TestCompartment {
	public static void main(String[] args) {
		Compartment[] compartment=new Compartment[10];
		Random r=new Random();
		for(int i=0;i<compartment.length;i++) {
			int type=r.nextInt(4)+1;
			switch (type) {
            case 1:
                compartment[i] = new FirstClass();
                break;
            case 2:
                compartment[i] = new Ladies();
                break;
            case 3:
                compartment[i] = new General();
                break;
            case 4:
                compartment[i] = new Luggage();
                break;
			}
		}
		for(int i=0;i<compartment.length;i++) {
			System.out.println("Compartment "+(i+1)+": "+compartment[i].notice());
		}
	}
}
