package Day22MultiDimensional_Continue;
// 1. print all even numbers ina same line
// 2. count odd numbers ==> return the total odd number
public class Nested_ForEach_Practice {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}};

        int countOdd = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for(int[] each1D : numbers){
            for(int eachElement : each1D){

                if(eachElement % 2== 0){
                    System.out.print(eachElement + " ");
                    sumOfEven += eachElement;
                }
                else{
                    sumOfOdd += eachElement;
                    countOdd++;
                }
            }}
        System.out.print("There are "+ countOdd+ " odd numbers ");
        System.out.println("The sum of even numbers are "+sumOfEven);
        System.out.println("The sum of odd numbers are "+sumOfOdd);
    }



    }


