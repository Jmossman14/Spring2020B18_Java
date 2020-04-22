package Day20_ArraysContinue;
/*
Array Utilities:
                import java.util.Arrays;

Arrays Class:
                Array.toString(); < ---- convert array to string!
            * must be converted to STRING before we print
 */
import java.util.Arrays;
public class Arrays_Utilities {
    public class ArraysUtilities {

    }

        public static void main(String args[] ) {
            int[] arr = {1,2,3};

            String r = Arrays.toString(arr);
            System.out.println(r);

            System.out.println(arr); // Array bMUST be converted to string before we print


            String names[] = {"Madina", "Fatih", "Osman"};

            System.out.println( Arrays.toString(  names  )  );


            double[] nums = {10, 20, 30 , 40, 50};

            System.out.println( Arrays.toString( nums )  );

            System.out.println( nums[0] + 1  );


        }
}
