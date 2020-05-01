package Day31_BulkOperations;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;
/*

Data Structurs:
		1. Array  ==>    Arrays (java.util)
		2. Collection ==> Collections (java.util), does not support primitive
		3. Maps  ==> does not support primitive
Methods:
	contains(Object): returns boolean

	equals(ArrayListName): compares two arrayList

	isEmpty(): returns boolean, depeding on the size
				size == 0  ===> true
				otherwise ==> false

 */


public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
            // add objects to list1
            list1.add("A");
            list1.add("B");
            list1.add("C");
            list1.add("D");

        boolean r1 =  list1.contains("C");

        System.out.println(r1);

        ArrayList<String> list2 = new ArrayList<>();
            // add objects to list2
            list2.add("A");
            list2.add("C");
            list2.add("B");
            list2.add("D");
            // sorts in ascending order
        Collections.sort(list1); // list1: {A, B, C, D};
        Collections.sort(list2); // list2: {A. B, C, D};


        boolean r2 = list1.equals(list2);

        System.out.println(r2); // false



        System.out.println("===============================");

//Arrays.equal(arr1, arr2)
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,1};
// sort and then compare with equals
        Arrays.sort(arr1);  //{1,2,3}
        Arrays.sort(arr2); //{1,2,3}

        boolean r3 = Arrays.equals(arr1, arr2);
        System.out.println(r3);

        System.out.println("=============================");
             // print arrayList from largest to smallest and add it to a new arrayList
        ArrayList<Integer> list3 = new ArrayList<>();
            // add integers to list3
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        //  expected: 1000 100 20 10
        //first sorts from smallest to largest
        Collections.sort(list3);

        System.out.println(list3);
        ArrayList<Integer> reversedList3 = new ArrayList<>();

        for(int i =list3.size()-1; i >= 0;  i--){

            //  System.out.print( list3.get(i) +" " );

            reversedList3.add( list3.get(i) );
        }
        System.out.println(reversedList3);

        //  list3 = reversedList3;

        System.out.println(list3);

        System.out.println(list3.size()); //  size: 4

        boolean r4 = list3.isEmpty(); // returns false since there is 4 indexs
        System.out.println(r4);

        // clear list will make it empty
        list3.clear();  // removes everything, size : 0
        boolean r5 = list3.isEmpty();


    }

}