package Replits_Practice;
import java.util.Scanner;
import java.util.Arrays;
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.
Example:
            nums -> [1, 1, 2, 3, 4, 3, 4]
                              2
 */
public class Arrays_FindNonDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count =0; // used to count integers that do not have a duplicate in the array

        for(int each1: nums) {
            count = 0;// starts at 0,
            for(int each2: nums) {

                if(each1  == each2) { // if integer is equal to integer
                    count++;
                }

            }
            if(count ==1) {
                System.out.println(each1);
            }
        }

    }

}
