package Replits_Practice;

import java.util.Arrays;

/*
Anagram is a word, phrase, or name formed by
 rearranging the letters of another, such as cinema, formed from iceman.

isAnagram method checks if word1 and word2 are anagram
to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

 */
public class Methods_Anagram {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()){
            return  false;
        }
        word1 =word1.toLowerCase();
        word2=word2.toLowerCase();
        char[] ch1 =word1.toCharArray();
        char[] ch2 =word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        if (Arrays.equals(ch1,ch2)){
            return true;
        }else {
            return false;
        }
    }
}