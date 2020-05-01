package Day31_BulkOperations;



import java.util.ArrayList;

import java.util.Arrays;



public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,2,3,3)) ;

        ArrayList<Integer> result = new ArrayList<>();  // 1 2 3 == stores elemnts

        //expected result: [1,2, 3]
// reulst ArrayList is currently empty...

         for(Integer each : list){  // each: 1, 1, 2, 2, 3, 3
            if( !result.contains(each)){ // if result doesnt contain each (list) then it will add that num to result


                result.add(each);
            }
        }

        System.out.println(result);



        System.out.println("=========================================================");

        /*

        write a program that can remove duplicates from an array of integer

                    do not use for each

         */

        Integer[] arr1 = {1,1,2,2,3,3};

        ArrayList<Integer> nonDuplicates = new ArrayList<>();  // 123



        for(int i =0; i < arr1.length; i++){
            if( !nonDuplicates.contains( arr1[i] )){

                nonDuplicates.add(arr1[i]);

            }



        }



        /*

            +,

            []

            +=

         */

        System.out.println(nonDuplicates);





    }





}