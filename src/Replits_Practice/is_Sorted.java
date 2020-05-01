package Replits_Practice;
/*
this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.
 */
public class is_Sorted {
    public static boolean isSort(int[] nums) {
        boolean sorted = true; //
        int max = -999999999; // max is larger than -999999999

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) { // if nums at i are larger than max(-99999999) than
                max = nums[i]; //add each # to max
                sorted = true;
            } else {
                sorted = false;
            }
        }
        return sorted;
    }
}
