package Day21MultiDimensional_Arrays;
/*
Multi Dimensional Array: a variable that can contain multiple arrays

2 dimensional: contains 1 dimensional arrays inside {}, must have two [] []
    int [] [] ArrayName = {  {1,2,3}, { 4,5,6}  };
                                0         1
    first set of [] will represent the index # of {} single dimensional array, 1 2 3
    2nd set of []  will represent the index # of {} second set of array, 4 5 6
- to print out individual numbers you need to call each index #
    int num1 = Arrayname [0] [2] (will pull from 0 index and pull num in index 2, which  = 3)

- think of multidimensinal as COLUMN & ROW in an excel spreadsheet


n dimensional: MUST contain (n-1) dimensional arrays
    3 dimensional array can contain 2 dimensional arrays
        int [] [] []
 */
import java.util.Arrays;
public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int [] arr = {1,2,3}; // single dimensional array
        // you can paste variable name ARR or the data {1,2,3}

        int [] [] arr2D = {  {1,2,3} , { 4,5,6}  }; // contains a single array (arr)
        //        //index #s of array:    0    ,     1
        // //index #s of individial :   0 1 2      0 1 2
        System.out.println( arr2D.length );

        int[] arr1D =   arr2D[1];     // {1, 2, 3};
        System.out.println( Arrays.toString(  arr1D )   );
        int num1 =    arr2D[1] [3] ;

        System.out.println(num1);
        // {'A', 'B' };
        //                   0    1         0    1    2
        char[][] ch2D = {  {'A', 'B' } ,  {'D', 'E', 'F'} ,  {'G', 'H', 'I'} };
        // index:               0                  1                 2

        char c1 =  ch2D[1] [0];
        System.out.println(c1);
        char[] ch2 =  ch2D[2];    //{G, H, I};

        System.out.println(  Arrays.toString(ch2)  );

        //                   0    1    2        0    1   2        0    1    2
        String[][]  str2D = {  {"A", "B", "C"},   {"D", "E", "F"},  {"J", "H", "I"}    };
        //                    0                    1               2

        String r1 =   str2D[2] [1];

        System.out.println(r1);

    }
}
