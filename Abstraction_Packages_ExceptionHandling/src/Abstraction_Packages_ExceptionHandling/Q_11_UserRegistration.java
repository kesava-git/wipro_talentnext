package Abstraction_Packages_ExceptionHandling;

public class Q_11_UserRegistration {
	public static void main(String[] args) {
		Q_11_UserRegistration reg=new Q_11_UserRegistration();
		try {
			reg.registerUser("kesava", "india");
		}catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		try {
            reg.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}
	void registerUser(String username,String userCountry) throws InvalidCountryException{
		if(!userCountry.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("User Outside India  cannot be registered");
		}
		else {
			System.out.println("User registration done successfully");
		}
	}
}
class InvalidCountryException extends Exception{
	public InvalidCountryException(String message) {
		super(message);
	}
}