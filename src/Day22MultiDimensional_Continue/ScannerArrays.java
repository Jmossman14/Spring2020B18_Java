package Day22MultiDimensional_Continue;
import java.util.Scanner;
import java.util.Arrays;
public class ScannerArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String arr[] = new String[5];



        for(int i = 0; i < arr.length ; i++){

            arr[i] = input.next();

        }



        System.out.println(Arrays.toString(arr) );



        for( String each  : arr  ){



            // String str = each.substring(0, 2+1);  // first three characters

            String str = each.charAt(0) + "" +  each.charAt(each.length()-1);  // first and last character

            System.out.println(str);

        }






    }
}
