package Abstraction_Packages_ExceptionHandling;

public interface Vehicle {
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
