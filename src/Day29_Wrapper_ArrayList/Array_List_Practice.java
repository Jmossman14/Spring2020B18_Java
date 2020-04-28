package Day29_Wrapper_ArrayList;
/*
Methods:
        add(): adds a number/string to the arrayList
        get(index#): gets the number/string at the given index
        size(): get the size of the Array List


 */
import java.util.ArrayList;

public class Array_List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<String>();
                            shoppingList.add("milk"); // sz. 1
                            shoppingList.add("coffee"); // sz. 2
                            shoppingList.add("bread"); // sz. 3
                            shoppingList.add("toilet paper"); //sz. 4


        for(int i = 0; i < 4; i++){// i value is 0-3
            System.out.println(i);
        }

        for(String each : shoppingList){
            System.out.println(each);
        }


        // size():

        int size = shoppingList.size();
        System.out.println(size);
        int lastIndex = size -1; // gets the last index #
        System.out.println(lastIndex);

    }
}
