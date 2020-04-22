package Day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass_Practice {
    public static void main(String[] args) {
        /* Task: have scanner add 2 variables and output the sum
            - declare variables (2)
            - make sure inputs are in bytes or variables range
            - make sure inputs and prints are in proper order
         */
        Scanner input = new Scanner(System.in); //declares the SCANNER (creates an "Object")
        System.out.println("Enter your first #"); // first text, user must input
        byte num1 = input.nextByte();// Manually enter # (must be in byte range)
        //can use other varibales such as Short:
                         // short num1 = input.nextShort();
                        // allows user to input SHORT data
        System.out.println("Enter your second #");// second text, user must input
        byte num2 = input.nextByte();// Manually enter # (must be in byte range)
        System.out.println("The sum of "+num1+" and "+num2+" is: "+(num1+num2) );
                /* OUTPUT:
                Enter your first #
                    40 (manual input)
                Enter your second #
                    50 (manual input)
                The sum of 40 and 50 is: 90
                 */


        
        
        
        
        
        
        
        
        
        
    }



}
