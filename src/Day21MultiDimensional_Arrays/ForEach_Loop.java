package Day21MultiDimensional_Arrays;

import java.util.Arrays;

/*
For Each Loop: loop that already iterated based on the size of data in the arrays
    - # of executions are already decided,
            - if 4 #s in array then it will iterate 4 times and then stop
*Declare a variable that can represent each element of that data
        for(DataType variableName: ArrayName){
                                }
                                VariableName represents each of the data in the array
                                Data Type MUST match Arrays Data type, (string, int)

when do we use: we MUST have a data structure && whenever we do not need to provide an index #

CANNOT USE TO REVERSE A STRING OR ANYTHING TO DO WITH AN INDEX #
 */
public class ForEach_Loop {
    public static void main(String[] args) {
      int[] nums = {1, 2, 3, 4};

        for (int eachElement : nums) {// eachElement represents data in nums  ("each element")

            System.out.println(eachElement);
        }
        String[] students = {"muhtar", "Asiya", "murodil" };

        for (String eachElement2 : students) {
            System.out.println(eachElement2);
        }

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10};
        for(int each:arr1){
            if(each <5){
                continue; // skips numbers less than 5 in the array
            }
            System.out.println(each);
        }
        Arrays.sort(arr1); // sorts #s from smallest to largest
        System.out.println(Arrays.toString(arr1)); // output [1, 2, 3, 4, 5, 6, 7, 8, 8, 10]
        System.out.println("=========================================================");
        //reverse with For EACH Loop



    }



    }

