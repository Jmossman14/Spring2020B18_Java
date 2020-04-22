package Day22MultiDimensional_Continue;
// 1. print all even numbers ina same line
// 2. count odd numbers ==> return the total odd number
public class nestLoops_Practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}};

            int countOdd = 0;
        for(int i = 0; i < numbers.length; i++){ // i = index num of 1D arrays

            for(int k =0; k< numbers[i].length;k++){// k = index num of elements in 1D arrays
               int num = numbers[i][k];
                if(num % 2 ==0){
                    System.out.print(num+" ");
                }else{
                    countOdd++; // counts the odd numbers
                }
            }
        }
        System.out.println();
        System.out.println(countOdd);
    }
}
