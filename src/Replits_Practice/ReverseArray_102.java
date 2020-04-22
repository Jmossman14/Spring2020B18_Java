package Replits_Practice;
import java.util.Scanner;
/*
Given a String variable sentence, write code to type each word in
 separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
public class ReverseArray_102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] reverse = sentence.split(" ");
        // reverse stores the sentence broken down by spaces(split)

        for(int i = reverse.length-1; i >=0; i--){
   // reverse.length-1 is telling compiler to start the loop at the end of sentence &
            // stop once it hits 0
            System.out.println(reverse[i]);

        }

        System.out.println("==============================================");




    }
}
