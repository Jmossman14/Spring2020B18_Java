package Day17_While_DoWhile_Loop;
/*
Warmup tasks:
    1. write a program that can ask the user "enter a number" five times and return the maximum number
                hint: you will nedd for loop and if statement
    2. write a program that can ask the user "enter a number" five times and return the minimum number
                hint: you will nedd for loop and if statement

 */
import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /*int max = -2147483647; // any # user inputs will be greater than this #
            // 1st input will be initialized to max #
            // 2nd input will be initialized to max #
            // 3rd input will be initialized to max #
            // 4th input will be initialized to max #
            // 5th input will be initialized to max #
    for(int a = 1; a <=5; a++){
        System.out.println("Enter a number");
        int num = scan.nextInt(); // user will input a #
     if(num > max){
         max = num; // user input becomes the max IF it is true
        }
     }
        System.out.println(max); // compiler will OUTPUT the MAX #

    /*
       2. write a program that can ask the user "enter a number" five times and return the minimum number
                hint: you will nedd for loop and if statement

     */

        int min = 2147483647; // assuming user input will be less than this #
                            // 1st input will be initialized to min #
                            // 2nd input will be initialized to min #
                            // 3rd input will be initialized to min #
                            // 4th input will be initialized to min #
                            // 5th input will be initialized to min #
        for(int b = 5; b >= 0; b--){
            System.out.println("Enter a number");
            int num1 = scan.nextInt(); // user will input a #
            if(num1 < min){
                min = num1; // user input the min IF it is true
            }
            //every time this loops the user input will be assigned to MIN, IF it is smaller than
            // the last user input...  compiler will capture the smallest num
            // once we SOUT MIN it will output smallest #

        }
        System.out.println(min); // compiler will OUTPUT theMIN #


    }



    }



