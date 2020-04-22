package Day22MultiDimensional_Continue;
/*
Make an area print in descending order :
input:  {10, 78, 2 , -1 , 500 , 70};
output: [500, 78, 70, 10, 2, -1]
 */
import java.util.Arrays;
public class Descending {
    public static void main(String[] args) {

        int[] arr = {10, 78, 2 , -1 , 500 , 70};
        Arrays.sort(arr); // will sort from smallest to largest


        int [] revArr = new int [arr.length];

        int j = arr.length-1;

        for(int i = 0; i < arr.length ; i++){ // i value increases
                revArr [i] = arr[j];
                j--;// j value decreases
        }
        System.out.println(Arrays.toString(revArr));





    }


    }
