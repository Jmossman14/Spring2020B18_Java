package Day52_Collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
      // List<String> list0 = new List<>();

        List<Integer> list1 = new ArrayList<>(); // reference type decides whats inheritable
        list1.add(1); // whatever is overridden will get printed (this one the ArrayList will be overridden)
                        // object type can be ArrayList and will be an array based list
                    // ArrayList is singly linked = much faster in terms of retreiving the data using the get method

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        //==========================================================
        // the actions of arrayList are NOT synchronized (synchronized keyword)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        // the actions of vector are synchronized (synchronized keyword)
        Vector<Integer> vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        // LIFO: last in, first out = last object will be output first
        Stack<String> names = new Stack<>();
        names.add("Sha");
        names.add("Judy");
        names.add("anna");
        names.add("Rustem");
        names.add("Keke");
        System.out.println(names);
        // use pop() to return the last object
       String s1 = names.pop(); // -> "Keke"
        System.out.println(s1);

        //reprint stack:
        System.out.println(names); // will only output Sha Judy Anna Rustem, keke was removed



    }
}
