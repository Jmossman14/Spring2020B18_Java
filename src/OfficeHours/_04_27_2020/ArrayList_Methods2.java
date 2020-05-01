package OfficeHours._04_27_2020;

import java.util.ArrayList;
public class ArrayList_Methods2 {
    public static void main(String[] args) {
        //indexOf(Object) ==> returns the index number
        ArrayList<Character> list1 = new ArrayList<>();
                        list1.add('A'); // index 0
                        list1.add('B');//index 1
                        list1.add('C'); //index 2
                        list1.add('D');//index 3
                        list1.add('C'); //index 4

            // get index #, then remove it
        int indexnum =  list1.indexOf('C'); //2
        int lastIndexNum = list1.lastIndexOf('C'); //4
        System.out.println(indexnum);
        System.out.println(lastIndexNum);

        System.out.println(list1);
        Character ch1 = 'C';
        //  list1.remove(ch1); remove the first 'C'

        list1.remove( list1.lastIndexOf('C') ); // removes the last index that contains C


        System.out.println(list1);


        // combining two arrays into list
        System.out.println("==========================================");
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13};

        ArrayList<Integer> list2 = new ArrayList<>(); // create an ArrayList to combine both arrays

        for(int each  : arr1){ // each element of arr1
            list2.add(each);
        }

        for(int each  : arr2){ // each element of arr2
            list2.add(each);
        }

        System.out.println(list2);

    }
}
