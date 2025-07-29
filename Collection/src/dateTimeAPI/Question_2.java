package dateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Question_2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate nextMonth = today.plusMonths(1).withDayOfMonth(1);

        int sundayCount = 0;
        LocalDate secondSunday = null;

        for (int i = 0; i < 31; i++) {
            LocalDate current = nextMonth.plusDays(i);
            if (current.getMonth() != nextMonth.getMonth()) {
                break; 
            }
            if (current.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;
                if (sundayCount == 2) {
                    secondSunday = current;
                    break;
                }
            }
        }

        if (secondSunday != null) {
            System.out.println("Next month's second Sunday falls on: " + secondSunday);
        } else {
            System.out.println("Could not find second Sunday!");
        }
    }
}
