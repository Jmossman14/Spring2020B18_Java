package Day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class time_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm, a");

        LocalTime time1 = LocalTime.of(9,30);
        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(12,0);
        System.out.println(time2.format(dtf));

        boolean result = time1.isAfter(time2);
        System.out.println(result);
    }
}
