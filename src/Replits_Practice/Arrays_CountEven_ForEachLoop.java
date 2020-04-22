package Replits_Practice;
import java.util.Scanner;
import java.util.Arrays;
/*
Given an array nums, calculate count of even numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
 */
public class Arrays_CountEven_ForEachLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};
        int countEvens = 0;

        for (int each : nums) {
            if (each % 2 == 0) {
                countEvens++;
            }
            System.out.println(countEvens);
        }
    }

}