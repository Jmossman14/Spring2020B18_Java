package Replits;
import java.util.Scanner;
public class PhoneNumber_Scanner {
/*
Write a program that asks user to input int values: areaCode and localNumber.
-Using concatenation put together in this format and assign to String phoneNumber  variable:
-(222)-3334444
-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444
 */
        public static void main(String[] args) {
            //YOUR CODE HERE
            Scanner input = new Scanner(System.in);
            int areaCode = input.nextInt();
            int localNumber = input.nextInt();
            String phoneNumber = "("+areaCode+")-"+localNumber;
            System.out.println("Calling numnber "+phoneNumber);

        }
    }

