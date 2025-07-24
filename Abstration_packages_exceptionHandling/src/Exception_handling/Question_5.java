package Exception_handling;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class Question_5 {

 public static void main(String[] args) {
     try {
         if (args.length < 2) {
             System.out.println("Error: Please provide both name and age as arguments.");
             return;
         }

         String name = args[0];
         int age;

         try {
             age = Integer.parseInt(args[1]);
         } catch (NumberFormatException e) {
             System.out.println("Error: Age must be a valid integer.");
             return;
         }

         if (age < 18 || age >= 60) {
             throw new InvalidAgeException("Error: Age must be between 18 and 59.");
         }

         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Validation Successful!");

     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     }
 }
}
