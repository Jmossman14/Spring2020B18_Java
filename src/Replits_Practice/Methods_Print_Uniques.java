package Replits_Practice;
/*
Complete a void method printUniqueWords() that will print only unique
words from an array of strings. Every single unique word should be printed from
the new line.
 */
import java.util.Scanner;

public class Methods_Print_Uniques {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE
        for (String each2:words){
            int count=0;
            for (String each:words){
                if (each2.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each2);
            }
        }



    }
}


