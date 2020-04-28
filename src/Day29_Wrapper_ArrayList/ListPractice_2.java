package Day29_Wrapper_ArrayList;

import Rescources.Library;

import java.util.ArrayList;

public class ListPractice_2 {
    public static void main(String[] args) {
           /*
        1. creat a list of integers
        add 5 integers to it
        return the max # from the list
         */
        //Step 1:
        ArrayList<Integer> nums = new ArrayList<Integer>();

        //Step 2:
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);
        nums.add(30);

        //Step 3:
        int maxNum = Integer.MIN_VALUE; // max is bigger then the smallest number INT can hold

        for(int i = 0; i < nums.size(); i++){

            if(nums.get(i) > maxNum){
                maxNum = nums.get(i);
            }

        }
        System.out.println(maxNum);

        int maxNum2 = nums.get(0);
        for(Integer each : nums){
            if(each > maxNum2){
                maxNum2=each;
            }
        }
        System.out.println(maxNum2);

        //================================
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(100);
        nums2.add(200);
        nums2.add(300);

        Max(nums2);
        int max = Library.Max(nums2);
    }

    public static int Max(ArrayList<Integer> nums){
        int maxNum = Integer.MIN_VALUE; // max is bigger then the smallest number INT can hold

        for(int i = 0; i < nums.size(); i++){

            if(nums.get(i) > maxNum){
                maxNum = nums.get(i);
            }

        }
        return maxNum;
    }
}
