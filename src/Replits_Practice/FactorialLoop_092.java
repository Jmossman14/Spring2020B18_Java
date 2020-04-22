package Replits_Practice;
import java.util.Scanner;
/*
In mathematics, the factorial of a positive integer n, denoted by n!,
is the product of all positive integers less than or equal to n.
Calculate factorial and output result to the console.
Example:
input: 5
output: 120
 */
public class FactorialLoop_092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();// user will input any number

       long num = 1; // create a variable to multiply all the #s

       for(int i = n; i > 0; i--){
           num *=i;
       }
        System.out.println(num);

    }
}
