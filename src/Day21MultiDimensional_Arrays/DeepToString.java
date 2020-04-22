package Day21MultiDimensional_Arrays;
/*
*** Arrays.deeptoString - can be used for multidimensional string
(Arrays.toString can only be used for a single dimensional array
=======================================================================
* n dimensional: MUST contain (n-1) dimensional arrays
    3 dimensional array can contain 2 dimensional arrays
    *                                   0             1               0            1
        int [] [] [] ArrayName = {  {{1,2,3}}  ,  {{4,5,6}}  ,   {{7,8,9}}  ,  {{10,11,12}}        };
                                                 0                            1
        * read as 2, 2 dimensional arrays stored in a 3 dimensional array

 */
import java.util.Arrays;
public class DeepToString {
    public static void main(String[] args) {

            int[] arr1D = {1, 2, 3};

            System.out.println(Arrays.toString(arr1D));
            int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};

            System.out.println(Arrays.toString(arr2D));
            System.out.println(Arrays.deepToString(arr2D));


            //                         0       1               0        1

            int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

            //                             0                          1

            System.out.println(Arrays.deepToString(arr3D[1]));
            System.out.println(Arrays.toString(arr3D[0][1]));
            System.out.println(arr3D[1][1][2]);


        }
    }

