package Day13_StringClasss;
import java.util.Scanner;
/*
Program that ask user to enter full name,
display First & Last name separately
first letter upper case of first & last name
 */
public class StringManipulation_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
       String FullName = input.nextLine();

       String FirstName = FullName.substring(0, FullName.indexOf(" "));
                        // first name starts at 0 and ends at the space
             //   FirstName = FirstName.substring(0,1).toUpperCase()+ FirstName.substring(1).toLowerCase();
                        // allows first letter of first name to be upper case & the rest to be lower

       String LastName = FullName.substring(FullName.indexOf(" ") + 1);
                        // last name starts 1 spot ( +1 ) after the space
     //  LastName = LastName.substring(0,1).toUpperCase()+ LastName.substring(1).toLowerCase();
        // allows first letter of first name to be upper case & the rest to be lower

        System.out.println("Your First name is: "+ FirstName);
        System.out.println("Your Last name is: "+ LastName);






    }
}
