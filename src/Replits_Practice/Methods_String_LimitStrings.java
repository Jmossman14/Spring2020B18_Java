package Replits_Practice;
/*
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

 */
public class Methods_String_LimitStrings {

    public static String limit(String text, int maxLength) {
        String ss="";
        for (int i=0;i<text.length();i++){
            if(ss.length()<maxLength) {
                ss+=text.charAt(i);
            }
        }
        return ss;
    }
}
