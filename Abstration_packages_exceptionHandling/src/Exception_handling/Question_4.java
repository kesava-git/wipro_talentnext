package Exception_handling;

class InvalidCountryException extends Exception {
 public InvalidCountryException() {
     super("User Outside India cannot be registered");
 }

 public InvalidCountryException(String message) {
     super(message);
 }
}
public class Question_4 {

 public void registerUser(String username, String userCountry) throws InvalidCountryException {
     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException();
     } else {
         System.out.println("User registration done successfully");
     }
 }

 public static void main(String[] args) {
     Question_4 userReg = new Question_4();

     try {
         userReg.registerUser("Mickey", "US");
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }

     try {
         userReg.registerUser("Mini", "India");
     } catch (InvalidCountryException e) {
         System.out.println(e.getMessage());
     }
 }
}
