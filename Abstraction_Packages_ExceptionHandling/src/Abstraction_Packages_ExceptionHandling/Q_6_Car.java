package Abstraction_Packages_ExceptionHandling;

public class Q_6_Car implements Vehicle,FourWheeler {
	public static void main(String[] args) {
		Q_6_Car car=new Q_6_Car();
		car.message();
	}

	@Override
	public void message() {
		Vehicle.super.message();
		FourWheeler.super.message();
	}
}
