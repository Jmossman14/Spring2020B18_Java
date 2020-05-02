package Replits_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList_CombinedAll {

    public static ArrayList<String> combineAL(ArrayList<String> worldList1, ArrayList<String> worldList2) {
        ArrayList<String> twoStrings = new ArrayList<String>();
        for (int i = 0; i <= worldList1.size() - 1; i++) {
            twoStrings.add(worldList1.get(i));
        }
        for (int i = 0; i <= worldList2.size() - 1; i++) {
            twoStrings.add(worldList2.get(i));
        }
        return twoStrings;
    }
}
