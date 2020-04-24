package Day28_DateTime;
/*
Date & Time:
    import java.time.LocalDateTime;
     LocalDateTime dt = LocalDateTime.now();


 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // 2020-03-20 11:25:30

        LocalDate date = LocalDate.of(2020,3,20);
        LocalTime time = LocalTime.of(11,25,30);
        System.out.println(date+" "+time);

        //combine both:
                // 1st way:
        LocalDateTime DateTime = LocalDateTime.of(date, time);
        System.out.println(DateTime);
                // 2nd way:
        LocalDateTime dateTime2 = LocalDateTime.of(2020,3,20,11,25,30);
        System.out.println(dateTime2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd"); // 3/20 w/out a year
        LocalDate date2 = LocalDate.of(2019,3,20);
        System.out.println(date2.format(dtf));
    }
}
