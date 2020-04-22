package Day26_MethodOverLoading;
import java.util.Arrays;
public class MethodOverloading2 {
    public static void main(String[] args) {
        // 10, 5
        sum2Numbers(10, 5);

        // 10, 5, 15
        sum3Numbers(10, 5, 15);

        // 10, 20, 30, 5
        sum4Numbers(10, 20, 30, 5);

        System.out.println("==================================================");

        // 10, 5
        sum(10, 5);

        // 15, 10, 5
        sum(10, 15, 5);

        // 10, 20, 30, 5
        sum(10, 20, 30, 5);


        int[] arr1 = {3, 2, 1};

        char[] arr2 = {'z', 's', 'a'};

        double[] arr3 = {7.4, 6, 5, 20.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3); // same method name, different parameter


    }


    public static void sum2Numbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum4Numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    //====================================================================================

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}

/*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
