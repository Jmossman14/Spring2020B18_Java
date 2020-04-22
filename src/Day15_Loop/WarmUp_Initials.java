package Day15_Loop;
import java.util.Scanner;
/*  warmup tasks:
    1. write a program that asks user's first and last name, then prints out the initials of the user
    Ex:
    input:
    cybertek
            batch12
    output:your initial is: CB*/
public class WarmUp_Initials {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name:" );
        String firstName = input.next();
        input.nextLine();


        System.out.println("Please enter your last name:" );
        String lastName = input.next();

        String initials = firstName.substring(0,1).concat(lastName.substring(0,1));
                initials = initials.toUpperCase();
        /*String Initials = "" + firstName.charAt(0) + lastName.charAt(0);
                            ^ allows char to be used with String
        */

        System.out.println(initials);







    }

}
