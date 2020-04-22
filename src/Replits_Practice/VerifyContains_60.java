package Replits_Practice;
import java.util.Scanner;

public class VerifyContains_60 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean yes = word.contains(sentence);
        //WRITE YOUR CODE HERE
        if(yes){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
