package Day18_nestedLoops;
import java.util.Scanner;

public class WarmUp_Factorial {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scan.nextInt(); // user will input a # in INT range -2147483647 -- 2147483647
        int factorial = 1; // will store every # within range of the # user inputs
        while (number > 0) {
            factorial *= number;// if number is 5, then it will store = 5*4*3*2*1
            number--; // takes the user input and counts down to 0 every loop
        }
        System.out.println(factorial);
    }
}
