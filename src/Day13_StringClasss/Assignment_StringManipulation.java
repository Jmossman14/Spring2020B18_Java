package Day13_StringClasss;
import java.util.Scanner;
 /*
        Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */

public class Assignment_StringManipulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Ask the user to input their first and last name
        System.out.println("Please Enter your first name: ");
        String firstName = input.next();
        System.out.println("Please Enter your last name: ");
        String lastName = input.next();


        // program to recognize first initial of each name
        String firstNameInitial = firstName.substring(0,1).toUpperCase();
        String LastNameInitial = lastName.substring(0,1).toUpperCase();

        // program to print initials
        String Initials = firstNameInitial+LastNameInitial;
        System.out.println(Initials);

    }
}
