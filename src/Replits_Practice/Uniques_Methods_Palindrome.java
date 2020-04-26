package Replits_Practice;
/*
Complete a method isPalindrome() that will check if number is a palindrome.
Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
 */
import java.util.Scanner;
import java.util.Arrays;

public class Uniques_Methods_Palindrome { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    isPalindrome(num);
}

    public static void isPalindrome(int num){
        //TODO
        int len = Integer.toString(num).length();
        int[] arr = new int[len];
        int j = 0;
        while (num != 0) {
            arr[j] = num % 10;
            num = num / 10;
            j++;
        }
        int rev[] = new int[arr.length];
        int k=arr.length-1;
        for (int i = 0; i <arr.length; i++) {
            rev[i] = arr[k];
            k--;
        }
        boolean result= Arrays.equals(arr,rev);
        System.out.println(result);
    }
}


