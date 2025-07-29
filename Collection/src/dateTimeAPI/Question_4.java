package dateTimeAPI;

import java.time.Year;

public class Question_4 {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();

        if (isLeapYear(currentYear)) {
            System.out.println(currentYear + " is a Leap Year.");
        } else {
            System.out.println(currentYear + " is NOT a Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

