package Replits_Practice;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySplitSentence_Loop106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] result = sentence.split(" ");
        // result stores the sentence separated space

        for (int i = 0; i <= sentence.length()-1; i++) {
      // compiler starts at index 0 (first word), and stops at the end of the sentence
            System.out.println(result[i]);// [i] will allow it to print
                                         // out the word at i, each loop
        }
    }
}
