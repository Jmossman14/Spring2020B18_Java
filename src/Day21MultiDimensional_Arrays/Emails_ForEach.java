package Day21MultiDimensional_Arrays;
/*
  given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
import java.util.Arrays;

public class Emails_ForEach {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String each: emails) {
            if (each.endsWith("gmail.com")) {
                continue;
            }
            System.out.print(each + " ");
        }

    }
}
