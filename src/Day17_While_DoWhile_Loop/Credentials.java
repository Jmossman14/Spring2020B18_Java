package Day17_While_DoWhile_Loop;
import java.util.Scanner;
/*
username: cybertek
pass: cybertek123
 */

public class Credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();

        input.nextLine();

        System.out.println("Enter password");
        String password = input.next();

        boolean valid = username.equals("cybertek") && password.equals("cybertek123");

        int count = 1;
        while (!valid) {//  while( this is not correct) keep asking user to input the below
            System.out.println("Re-enter username & password"); // if username/password are incorrect
            System.out.println("Enter username");
            username = input.next();

            System.out.println("Enter password");
            password = input.next();

            valid = username.equals("cybertek") && password.equals("cybertek123");
            // reassigning variable to valid because valid will become what user input

            // count will allow user to input 3 times, after 3 it will lock
            count++;
            if (count == 3) {
                System.out.println("Your account is locked");
                break;
            }

        }
            if (valid) {
                System.out.println("Logged in");


        }

    }


    }

