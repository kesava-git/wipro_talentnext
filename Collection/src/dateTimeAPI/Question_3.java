package dateTimeAPI;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your joining date (yyyy-mm-dd): ");
        String joiningDateStr = sc.nextLine();

        LocalDate joiningDate = LocalDate.parse(joiningDateStr);
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("\nYour experience in Wipro:");
        System.out.println(experience.getYears() + " years, " +
                           experience.getMonths() + " months, " +
                           experience.getDays() + " days");

        sc.close();
    }
}

