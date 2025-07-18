package Abstraction_Packages_ExceptionHandling;

public abstract class Compartment {
		public abstract String notice();
	}
	class FirstClass extends Compartment{
		@Override
		public String notice() {
			return "FirstClass Compartment";
		}
	}
	class Ladies extends Compartment{
		@Override
		public String notice() {
			return "Ladies Compartment";
		}
	}
	class General extends Compartment{
		@Override
		public String notice() {
			return "General Compartment";
		}
	}
	class Luggage extends Compartment{
		@Override
		public String notice() {
			return "Luggage Compartment";
		}
}
