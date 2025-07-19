package Abstraction_Packages_ExceptionHandling;

import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String str) {
        super(str);
    }
}

class InvalidNumberOfInputException extends Exception {
    InvalidNumberOfInputException(String str) {
        super(str);
    }
}

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            if (args.length != 2) {
                throw new InvalidNumberOfInputException("Please enter exactly 2 values: <name> <age>");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age should be between 18 and 59");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("User registration successful.");

        } catch (InvalidNumberOfInputException e) {
            System.out.println("Input Error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Age Format: Age must be a number.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
