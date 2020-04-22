package Replits_Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays_PrintFirstChar_Loops {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
            //                0                1                 2               3                   4

        for(int i =0; i< words.length;i++) {

            words[i] = " "+ words[i].charAt(0)+words[i].charAt(words[i].length()-1);
            words[i] =words[i].trim();

            System.out.println(words[i]);

        }
    }
}
