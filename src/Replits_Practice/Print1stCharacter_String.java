package Replits_Practice;
import java.util.Scanner;
/*
Write a program that will print out first character of the word.
 */
public class Print1stCharacter_String {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        /*String firstletter = ""+word.charAt(0);
        System.out.println(firstletter);*/

        System.out.println("please enter a word: ");
        int length = word.length()-1;
        String lastLetter = ""+word.charAt( length );
        System.out.println(lastLetter);


    }
}
