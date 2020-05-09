package Replits_Practice;
/*
Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.

For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
{4,6,11,3}
 */
public class CustomClass_RowSum {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] sums = rowSums(a);
        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }
    public static int[] rowSums(int[][] nums)
    {
        int[] rowSums = new int[nums.length];
        int count = 0;
        for(int[] each2D: nums) {
            int totalOf1D = 0;
            for(int each1D: each2D) {
                totalOf1D += each1D;
            }
            rowSums[count] = totalOf1D;
            count++;
        }

        return rowSums;
    }
}

