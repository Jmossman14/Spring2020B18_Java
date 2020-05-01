package Day31_BulkOperations;

/*
Bulk Operations:
		containsAll(CollectionType): verifies if all objects in CollectionType are
		 contained in the list or not, returns boolean

		addAll(CollectionType): adds multiple objects, adds all the objects from
		given collection type

		removeAll(CollectionType): removes multiple objetcs, removes all the matching
		 objects

		retainAll(CollectionType): emoves all the unmatching objects
					{1,2,3,4,5,6,7,1,2,3,4}
					removeAll(1,2,3,4) ==> {5,6,7}
					retainAll(1,2,3,4) ==> {1,2,3,4,1,2,3,4 }


Arrays.asList(object1, object2 ..): returns the collection type (List)
            // you can paste as many objects as you want

 ArrayList<Integer> numList = new ArrayList<>(CollectionType);


 */



import java.util.ArrayList;

import java.util.Arrays;



public class Bulk_RemoveAll {



    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3 ,4,5,6,7,8, 1, 3, 3, 3, 3, 3, 3, 3) );

        System.out.println(list);

        // remove 1, 3, 5, 8

/*

                Integer a = 1;

                list.remove(a);

                list.remove(a);



                Integer b = 3;

                list.remove(b);

                list.remove(b);



 */

        //  list.removeAll( Arrays.asList(3,1,5,8)  );



        Integer[] arr ={3,1,5,8};

        list.removeAll( Arrays.asList(arr) );





        System.out.println(list);



        System.out.println("=========================================================");

        // remove all names ahmed

        String[] names = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Ahmed"};

        ArrayList<String> nameList = new ArrayList<>( Arrays.asList(names) );
        System.out.println(nameList); // outputs all names

        nameList.removeAll(  Arrays.asList("Ahmed")  );
        System.out.println(nameList);// doesnt output ahmed

        /*

             1. write a program that can remove duplicates from an arraylist

         */





    }



}