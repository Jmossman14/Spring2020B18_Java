package Day28_DateTime;
/*
Time:
            import java.time.LocalDateTime;

formatting:

        hours: hh -> 01

        minutes: mm -> 55

        am/pm: a -> converts to am or pm depending on the hour

 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now(); // outputs current time
        System.out.println(time1);

        LocalTime time2 = LocalTime.of(15, 30); // hour & minutes
                        // can also do hour, minute, or seconds
        System.out.println(time2);

    }
}
