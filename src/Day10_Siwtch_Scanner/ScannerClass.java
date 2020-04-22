package Day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

    // Scanner variableName = new Scanner(System.in);
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a Byte #:"); // prints this first
           byte num1 = input.nextByte(); // < -- allows input of Byte value and takes user input
                                        // and outputs the # entered
        System.out.println("You have entered "+num1);
        // adding an IF statement using scanner and Byte
        if(num1 % 2 == 0){
            System.out.println(num1+" is an even #");

        }else{
            System.out.println(num1+" is an odd #");}



















    }
}
