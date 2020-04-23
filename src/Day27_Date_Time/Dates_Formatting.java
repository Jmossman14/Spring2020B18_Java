package Day27_Date_Time;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
In order to format a date, you need to have a date, then provide a pattern.


To import:
        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;

to Format: - allows you to choose the order you want date to print (yyyy/MM/dd) or(yyyy-MM-dd)
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("");
        .format(DTF)

        formatter always returns STRING

year: yy-> last 2 digits
year: yyyy -> entire year

month: MM -> # of month
month: MMM -> first 3 letters of month
month: MMMM -> entire month

day: dd
day: EEE -> first 3 letters of day
day: EEEE -> entire day

 */
public class Dates_Formatting {
    public static void main(String[] args) {
        // allows you to format date:
        DateTimeFormatter DTF1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");// you can choose the order of how you want the date to appear
        DateTimeFormatter DTF2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");//
        DateTimeFormatter DTF3= DateTimeFormatter.ofPattern("MMM/dd/yyyy"); // MMM gives the first 3 letters of month

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(DTF1));// .format will allow you to format the date
        System.out.println(date1.format(DTF2));
        System.out.println(date1.format(DTF3));


        // create a date called Birthday: MMM/Days/year
        // ex: 2020 04 23 -> output: Apr/23/20

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM/dd/yy");// Jul/26/94
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM dd,yyyy");// July 26, 1994
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEE - MMM/dd/yy"); // Tue - Jul/26/94
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE - MMM/dd/yy"); // Tuesday - Jul/26/94


        LocalDate myBirthday = LocalDate.of(1994,07,26);
        System.out.println(myBirthday.format(dtf1));
        System.out.println(myBirthday.format(dtf2));
        System.out.println(myBirthday.format(dtf3));
        System.out.println(myBirthday.format(dtf4));
    }

}
