package Replits_Practice.Cybernators;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cybernators_06_13_20 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); //pulls local/current date
        System.out.println(today);

        LocalTime time = LocalTime.now();
        System.out.println(time); // pull local/current TIME

        LocalDateTime dateTime = LocalDateTime.of(2012,4,3,4,5);
        System.out.println(dateTime);


        int hour = dateTime.getHour(); // pulls the hour from dateTime
        System.out.println("The hour is: "+hour);

        int day = today.getDayOfYear(); // pulls the day of the LocalDate "now" object
        System.out.println("Today is the "+day+"th of the year");

        int monthLength = today.lengthOfMonth();// pulls the days in the month of the current LocaleDate
        System.out.println("There are "+monthLength+" days in June");

    }

}
