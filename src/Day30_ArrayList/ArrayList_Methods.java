package Day30_ArrayList;
/*
Methods:
        add(Object): adds objects to the arraylist
        add(index, Object): adds the object at the given index
                list ==>   {1,3,4};
                         list.add(1 , 2)
                list ==> {1,2,3,4}

                list2 ==> {"A", "C", "D"}
                "B"list2.add("B"); ==> {A, C, D, B}
                list2.add(1, "B");  ==> {A, B, C, D}


    set(index, Object): replaces the original object at given index with the new given object replacing

    remove(int index): object at the given index will be removed. ONLY one

    remove(Object): given object will be removed, returns boolean. ONLY one

clear(): remove everything from arrayList, size will be 0

indexOf(Object): returns the index number of the object int
            list ==> {"A", "A", "B"}
            list.indexOf("A") ==> 0

 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5); // 0
        list1.add(7);  //2
        list1.add(8);  // 3

        list1.add(1, 6);  //1
        // {5,6, 7,8}

        //   list1.add( 7, 10);  // index out of bound

        list1.set(3, 9);

        System.out.println(list1);

        int[] arr = {1, 2, 3, 4}; // {1,2,3,4,5}
        arr[3] = 5;   // {1,2,3,4,5}

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A"); // {A}
        list2.add("B");  //{A, B}
        list2.add(1, "C"); // {A, C, B}
        list2.add(1, "D");  // {A, D, C, B}

        list2.set(3, "F"); // {A, D, C, F}

        list2.set(2,  "E"); // {A, D, E, F}

        System.out.println(list2);   // {A, D, E, F}


        System.out.println("===============================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); // 0
        list3.add(2); // 1
        list3.add(3); // 2
        list3.add(4); // 3

        /*
        // {1,2,3,4}
                int a =1;
              list3.remove(a);  // {1,3, 4}
              */



        // {1,2,3,4}
        Integer a = 1;
        list3.remove(a); //{2,3,4}

        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        // {10, 20, 30}
        //          0    1   2

        // list4.remove(20); // index out of bound

        //  list4.remove(1);  //{10, 30}

        Integer a2 = 100;
        boolean r1 = list4.remove(a2);  // false

        System.out.println(list4);
        System.out.println(r1);





    }

}
