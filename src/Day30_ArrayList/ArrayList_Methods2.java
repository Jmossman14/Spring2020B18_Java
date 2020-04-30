package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");  //0
        list.add("B"); //1
        list.add("C");  //2


        // list.remove(1); < --  removes letter at index 1
        // String str = "B"; allows you to remove B from array List and will output BOOLEAN


        boolean r1 =  list.remove("F"); // false , because there is no F in ArrayList

        boolean r2 = list.remove("A"); // true, because there is an A in ArrayList

        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);

        // CLEAR METHOD
        list.clear(); // putting this at the bottom of an ArrayList will allow you to clear entire arrayList


        System.out.println(list);
        System.out.println(list.size());


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  // index 0
        list2.add(1);  //index 1
        list2.add(2);  // index 2
        list2.add(3);  //index 2

        //{1,1,2,3}

        int num1 = list2.indexOf(1); //0
        // Integer = int  ==  AUtoboxing

        System.out.println(num1);

        int num2 =  list2.indexOf(100); // index 100 doesnt exist, so it will output negative #
        System.out.println(num2);

        int num3 = list2.indexOf(3);  //3
        System.out.println(num3);





    }

}