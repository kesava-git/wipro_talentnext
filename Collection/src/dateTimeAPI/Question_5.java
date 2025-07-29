package dateTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Question_5 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();

        LocalTime newTime = currentTime.plusMinutes(25);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Current Time: " + currentTime.format(formatter));
        System.out.println("Time After 25 Minutes: " + newTime.format(formatter));
    }
}

