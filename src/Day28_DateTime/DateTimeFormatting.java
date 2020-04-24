package Day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a, EEE"); // 12/25/2015 11:30 am, Fri
        LocalDateTime dateTime1 = LocalDateTime.of(2015,12,25,11,30,45);

        System.out.println(dateTime1.format(dtf));
    }
}
