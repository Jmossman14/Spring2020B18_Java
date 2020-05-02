package Replits_Practice;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_CombineTwoStrings {
    public static void main(String[] args) {
        String[] word1 = {"f","o","o"};
        String[] word2 = {"b","a","r"};
        System.out.println(combineRs(word1,word2));
    }
    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String>combine=new ArrayList<>();
        combine.addAll(Arrays.asList(r1));
        combine.addAll(Arrays.asList(r2));
        String []str=combine.toArray(new String [combine.size()]);
        String result="";
        for(int i=0; i<str.length; i++){
            result+=str[i];
            //System.out.println(str[i]);
        }
        return result;
    }
}