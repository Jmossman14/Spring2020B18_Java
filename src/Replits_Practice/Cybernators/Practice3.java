package Replits_Practice.Cybernators;

import Day14_StringManipulationCont.Practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice3 {
    public static void main(String[] args) {

        Practice3.birthday(2020,6,13);


        Practice3 myBirthday = new Practice3();
        myBirthday.birthday(1994,7,26);
        System.out.println(myBirthday);
    }

    public static void birthday(int year, int month, int day){ // return type should be void since we just need to print the statement

        LocalDate birthday = LocalDate.of(year,month,day); // places argument in here so that the users input will be placed in this formatter
        LocalDate today = LocalDate.now(); // will compare birthday to the current day

        //in order to compare the month and day of birthday to todays month and day
        int Month = today.getMonthValue();
        int Day = today.getDayOfMonth();

        if(Month == month && Day ==day){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE MMM dd, yyyy");
            System.out.println("Today, "+today.format(dtf)+" is your birthday. HAPPY BIRTHDAY");
        }else{
            System.out.println("Today is not your birthday");

        }

    }
}
