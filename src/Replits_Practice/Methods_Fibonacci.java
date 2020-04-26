package Replits_Practice;
/*
Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers for
example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers
of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34
 */
import java.util.Scanner;

public class Methods_Fibonacci { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    fib(num);
}
    public static void fib(int num) {
        //TODO
        int[] fib = new int[num + 1];
        int k = 1;
        for (int i = 1; i < fib.length; i++) {
            fib[i] = k;
            k += fib[i - 1];
        }
        System.out.println(fib[num]);
    }
}
