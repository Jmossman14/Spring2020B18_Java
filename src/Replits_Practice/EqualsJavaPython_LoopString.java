package Replits_Practice;
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
import java.util.Scanner;
public class EqualsJavaPython_LoopString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0, countPython = 0;

        for (int i = 0; i < sentence.length() - 3; i++) {
            if (sentence.substring(i, i + 4).equals("java"))
                countJava++;
        }

        for (int i = 0; i < sentence.length() - 5; i++) {
            if (sentence.substring(i, i + 6).equals("python"))
                countPython++;
        }

        System.out.println(countJava == countPython);

    }
    // another way to solve task :
        /*
        int countOfJava = 0;
        int countOfPython = 0;

        while(sentence.contains("java")||sentence.contains("python")){
            if (sentence.contains("java")){
                sentence=sentence.replaceFirst("java","");
                countOfJava++;
            } else if (sentence.contains("python")){
                sentence=sentence.replaceFirst("python","");
                countOfPython++;
            }
        }
        if (countOfJava==countOfPython){
            System.out.println("true");
        } else{
            System.out.println("false");
        }*/

    }

