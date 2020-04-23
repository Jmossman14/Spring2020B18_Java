package Day27_Date_Time;
/*
Date&Time:
        import using: import java.time.LocalDate;

         LocalDate date1 = LocalDate.of(2020,10,25)
              format                    year,month,day
         .isBefore();
         .isAfter();
         .isLeapYear();
         .isEqual();

      Declaring current date:
            LocalDate now = LocalDate.now();


 */
import java.time.LocalDate;

public class Dates {
    public static void main(String [] args){
        // one way to declare a local date:
        LocalDate date1 = LocalDate.of(2020,10,25);

        System.out.println(date1);

        LocalDate birthday = LocalDate.of(2020,12,25);

        System.out.println(birthday);

        //.isAfter(date2)

        boolean result1 = date1.isAfter(birthday); // if TRUE  - > true // if FALSE -> false
        System.out.println(result1);

        // .ifBefore(date2)
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        //.isEqual(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        // .isLeapYear(Feburary has 29 days)
        boolean result4 = birthday.isLeapYear();

        System.out.println("==============================================================");

        //Another way to declare a date:

        LocalDate now = LocalDate.now(); // will declare the current date
        System.out.println("todays date is: "+now);

        // convert to a string: allows you to manipulate how the date is written

        String str = now.toString();
        System.out.println(str.replace("-"," "));









     /*   LocalDate birthday_Rahman = LocalDate.of(1990, 04,25 );
        int month = birthday_Rahman.getMonthValue(); // this will output the month value
     */
    }
}
