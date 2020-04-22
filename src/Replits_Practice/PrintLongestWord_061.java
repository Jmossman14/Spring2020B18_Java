package Replits_Practice;
import java.util.Scanner;
/*
Task, output the longer word
 */
public class PrintLongestWord_061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();



        if(word1.length() > word2.length()){
            System.out.println(word1);
        }else {
            System.out.println(word2);
        }
    }
}
