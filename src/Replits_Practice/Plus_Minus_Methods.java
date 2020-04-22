package Replits_Practice;
/*
Create a method called plus_minus that gets an array of ints (int[]),
it outputs how many negative , positive and zero numbers are in the array.

for example:

            plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
            positives:3, negatives:2, zeros:1
 */
import java.util.Scanner;
public class Plus_Minus_Methods {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }
        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] arr) {
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int nubmerOfZeros = 0;
        for (int each : arr) {
            if (each > 0) {
                numberOfPositives++;
            } else if (each < 0) {
                numberOfNegatives++;
            } else {
                nubmerOfZeros++;
            }
        }
        System.out.println("positives:" + numberOfPositives + ", negatives:" + numberOfNegatives + ", zeros:" + nubmerOfZeros);
    }
}

