package Day31_BulkOperations;


import java.util.ArrayList;

import java.util.Arrays;

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

public class Bulk_ContainsAll {



    public static void main(String[] args) {

        ArrayList<Integer> list1 =  new ArrayList<>();
         // adds objects to the arrayList list1
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        // if 10, 20, 60, 80, 100, 200 , 4000 if all objects exits in arraylist ==> true
        // otherwise==> false



        /*

            boolean r1 = list1.contains(10);
            boolean r2 = list1.contains(20);
            boolean r3 = list1.contains(60);
            boolean result = r1 == true && r2 == true && r3 == true;
            // if all true, all #s are contained in list1
        System.out.println(result); == > false
         */



        boolean result2 =   list1.containsAll(  Arrays.asList(10, 20, 30)  );
        // CollectionType - will output TRUE if ALL objects are in the List and FALSE if not
        System.out.println(result2);



        // 10, 30, 40
        Integer[] data = {10, 30, 40};
        boolean result3 =  list1.containsAll( Arrays.asList(data)  ); // convert object array as a list
        System.out.println(result3);



    }





}
