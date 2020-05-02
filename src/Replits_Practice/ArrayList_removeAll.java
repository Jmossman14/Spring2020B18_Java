package Replits_Practice;

import java.util.ArrayList;

public class ArrayList_removeAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

    }

    public static void removeAll(ArrayList<String> wordList, String targetWord){
    for(int i=0; i<wordList.size(); i++){
        if(wordList.get(i).equals(targetWord)){
            wordList.remove(wordList.get(i));
        }
    }
    System.out.println(wordList);
}

}

