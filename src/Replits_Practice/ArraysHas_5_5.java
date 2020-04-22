package Replits_Practice;
import java.util.Scanner;
import java.util.Arrays;
/*
Given an array of ints, print true if the array contains a
5 next to a 5 anywhere in the array. If no consecutive 5s or
no 5s are detected in your code then print false.

nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
 */
public class ArraysHas_5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count = 0; // counts the amount of 5s in the array

        for (int i = 0; i< nums.length-1; i++) {

            if (nums[i]== 5 & nums[i+1] == 5 ) { // if i is 5 and the index next to it [i+5] is  5
                count++;// then count it

            }
        }
        if (count >=1) { // if count is greater or equal to 1 then print out TRUE
            System.out.println("true");
        }else {// if not, print false
            System.out.println("false");
        }
    }
}
