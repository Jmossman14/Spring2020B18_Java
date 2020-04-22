package Day21MultiDimensional_Arrays;

/*
	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
/*
how to:
-get the sum of all # in array
        sum of all #s divided by the length of array
- call the length
       int length =  variableName.length;
- create a loop to add all numbers in array
     int i = 0; i <= length-1; i++
- create a new variable to gather each number
     int eachNum = arr[i]
- you want each # to be added to the previous so create a sum variable
       sum+= eachNum;
- print sum and average
          System.out.println(sum);
          System.out.println(sum/length); // to find average

 */


public class AverageNumber {
    public static void main(String[] args) {
       int[] arr = {10,20,30,40,50};
       //sum of all #s divided by the length of array

        int length = arr.length; // total number of elements
        int sum = 0;
        for(int i = 0; i <= length-1; i++){ // < length or <=length - 1 gives compiler a range
            // i  = index #s in arrays
            int eachNum = arr[i]; // array # will be identified by each loop
            sum+= eachNum; // each number will be added to the sum of the previous
        }

        System.out.println(sum); // to find sum
        System.out.println(sum/length); // to find average whole #
        System.out.println(sum/(double)length); // to find average decimal #.


        // if you want to get the most accurate average you can convert to a decimal:
        /*
        -you can change all variables to DOUBLE instead of INT
         OR you can just add double to formula : System.out.println(sum/(double)length)
         OR you can DF FORMAT: System.out.println(DF.format(sum/length));
         */
    }
}
