package Replits_Practice;
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
public class Methods_String_BiggerString {
    public static String biggerS(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        }
        return b;
    }
}