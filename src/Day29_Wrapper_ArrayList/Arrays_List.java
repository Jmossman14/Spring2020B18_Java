package Day29_Wrapper_ArrayList;
/*
Arrays List: is a part of the collectionsdata structure
    - import java.util.ArrayList;
    - Can contain multiple data
    - gives you the function to add and remove from the array[] collection

            ArrayList < DataType> name = new ArrayList <DataType>
                        Mandatory

 //Array list - do not need to specify the size of the array List
      - size is Dynamic; it adjust (add or remove things from array) optional
*Does not support primitives, only support none primitives
    *Use WRAPPER instead of PRIMITIVES

 Methods:
        add(): adds a number/string to the arrayList
        get(index#): gets the number/string at the given index







 */
import java.util.ArrayList;

public class Arrays_List {
    public static void main(String[] args) {
    ArrayList <Integer> scores = new ArrayList<Integer>();// sz = 0
                                            // add 5 => sz = 5
                                            // remove 2 => sz = 3


        scores.add(10);// autoboxing > sz: 1
        scores.add(20);// autoboxing > sz: 2
        scores.add(30);// autoboxing > sz. 3
        System.out.println(scores);
        // output is [10,20,30]

        scores.get(2); // will get the # at index 2 => 30
        Integer a1 = scores.get(2); // no boxing

        int a2 = scores.get(2); // unboxing

        double a3 = scores.get(2); // unboxing

        System.out.println(a1+", "+a2+", "+a3);


    //=========================================================




    }
}
