package Exception_handling;

import java.util.Scanner;

class NegativeValueException extends Exception {
 public NegativeValueException(String message) {
     super(message);
 }
}

class OutOfRangeException extends Exception {
 public OutOfRangeException(String message) {
     super(message);
 }
}

public class Question_3 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int numberOfStudents = 2;

     for (int i = 1; i <= numberOfStudents; i++) {
         try {
             System.out.println("Enter name of student " + i + ": ");
             String name = scanner.nextLine();

             int[] marks = new int[3];
             int sum = 0;

             for (int j = 0; j < 3; j++) {
                 System.out.println("Enter mark " + (j + 1) + " for " + name + ": ");
                 String input = scanner.nextLine();

                 int mark = Integer.parseInt(input); 

                 if (mark < 0)
                     throw new NegativeValueException("Marks cannot be negative.");
                 if (mark > 100)
                     throw new OutOfRangeException("Marks must be between 0 and 100.");

                 marks[j] = mark;
                 sum += mark;
             }

             double average = sum / 3.0;
             System.out.println("Average marks for " + name + ": " + average);

         } catch (NumberFormatException e) {
             System.out.println("Error: Please enter only integer values. " + e.getMessage());
             i--;
         } catch (NegativeValueException | OutOfRangeException e) {
             System.out.println("Error: " + e.getMessage());
             i--;
         }

         System.out.println("----------------------------------");
     }

     scanner.close();
 }
}
