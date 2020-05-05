package Day33_CustomClass;

import Day29_Wrapper_ArrayList.Array_List_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
1. write a program that can return the unique objects
from a anArray List
of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
 */
public class UniqueObjects{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));

        list.removeIf(p -> Collections.frequency(list, p) > 1); // if the frequency is greater than 1 (appears more than once)
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,4,5,5));
        list2.removeIf(q -> Collections.frequency(list2,q) == 1); // if frequency is equal one (not duplicated)
        System.out.println(list2);





    }
}
