package Day23_Methods;
import java.util.Arrays;
import java.util.Scanner;
/*
4. creata a function that can print the maximum number from any given array

 */
/*
5. creata a function that can print the minimum number from any given array

 */
/*
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */
public class MethodParamtersTask {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 whole numbers");
        int []  numbers= {input.nextInt(), input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt()};


        Max_Num(numbers);
        Min_Num(numbers);
        DescendingNums(numbers);


    }

    public static void Max_Num (int numbers[]) {

       int max = -999999999;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {  // array's index are compared with each other, and whichever is greater will be assigned to the max
                max = numbers[i]; // place i in [] so the largest number will be placed in []
            }
        } System.out.print("The max number you entered is: "+max);
        System.out.println();
        }
        //Min
        public static void Min_Num ( int numbers[]){
            int min = 999999999;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            } System.out.println("The min number you entered is: "+min);
            System.out.println();
        }

        // Descending Order
        public static void DescendingNums (int numbers[]){
        Arrays.sort(numbers);
        int [] revArr = new int [numbers.length];
        int j = numbers.length-1;
            for(int i = 0; i < numbers.length ; i++){ // i value increases
                revArr [i] = numbers[j];
                j--;// j value decreases
            }
            System.out.println("Descending order: "+Arrays.toString(revArr));

        }

}
