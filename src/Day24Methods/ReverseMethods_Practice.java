package Day24Methods;
/*
        creata a function that can return the maximum number from any given array

     */
import java.util.Arrays;
public class ReverseMethods_Practice {
        public static void main(String[] args) {

            int[] arr = {9, 8, 7, 100, 200, 50, 40};

            int max = maxNumber(arr);
            System.out.println(max);

            int min = minNumber(arr);
            System.out.println(min);

        }

        public static int maxNumber(int[] arr) {

            Arrays.sort(arr);
            return arr[arr.length - 1];

        }
        public static int minNumber(int[] arr) {

            Arrays.sort(arr);

            return arr[0];

        }

    }
