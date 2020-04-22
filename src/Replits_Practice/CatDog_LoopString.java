package Replits_Practice;
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */
import java.util.Scanner;

public class CatDog_LoopString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        for (int i = 0; i < word.length() - 2; i++) {
//                         length of word -2, to count 3 letters(cat or dog) at a time
            if (word.substring(i, i + 3).equals("cat")) // i + 3, so it will count all text in CAT
                countOfCats++;

            if (word.substring(i, i + 3).equals("dog"))// i + 3, so it will count all text in DOG
                countOfDogs++;

        }

        System.out.println((countOfDogs == countOfCats) ? true : false);
        //                count of dogs = count of cats, print TRUE or FALSE if count is equal


        }
    }

