package Replits_Practice;
/*
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
import java.util.Scanner;

public class JavaCount {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;
        for(int i=0; i<= word.length()-3; i++){
            //length of word -3, to count 4 letters(java) at a time
            if(word.substring(i,i+4).equalsIgnoreCase("java")){
                // i + 4 = 0,1,2,3 (index #s)
                count++;
            }
            System.out.println(count );
        } }







    }

