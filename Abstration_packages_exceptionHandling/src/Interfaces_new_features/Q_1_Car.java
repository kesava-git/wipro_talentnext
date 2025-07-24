package Interfaces_new_features;

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

public class Q_1_Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
    }

    public static void main(String[] args) {
    	Q_1_Car myCar = new Q_1_Car();
        myCar.message();  // Call the overridden method
    }
}
