package Replits_Practice.Cybernators;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        //formatting the date and time;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMM dd, yyy hh:mm a");
        System.out.println("The current time and date is: "+today.format(dtf));

        // converting a String to a date and time:
        String DT = today.toString();
        System.out.println(DT);

    }
}
