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



public class Bulk_RetainAll {

// removed all the unmatching objects

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll( Arrays.asList(1,2,3,4,5,6,1,2,3) );

        // only keep 1,2,3



        list.retainAll( Arrays.asList(1,2,3) );

        //{4,5,6}, {1,2,3, 1,2,3}



        System.out.println(list);







    }



}