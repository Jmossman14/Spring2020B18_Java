package Day14_StringManipulationCont;

import java.util.Scanner;

public class CheckWords {
/*
1. Write a program CheckWords:
    Program accepts 3 words and :
    - if they are same length:      print "All words are same length"
    - if some same length and others not:    print "Not Same nor Different lengths"
    - if all different length :  print "All different length"
 */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 1st word:  ");
    String w1 = input.next();
    input.nextLine();
    System.out.println("Please enter 2nd word:  ");
    String w2 = input.next();
    System.out.println("Please enter 3rd word:  ");
    String w3 = input.next();

    int w1r = w1.length();
    int w2r = w2.length();
    int w3r = w3.length();

    boolean NotSame = w1r != w2r && w2r != w3r && w1r != w3r;

    if(w1r == w2r && w2r == w3r){
        System.out.println("All words are the same");
    } else if(NotSame){
        System.out.println("All words are different");
    }else{
        System.out.println("Not same nor different lengths");
    }










}


}
