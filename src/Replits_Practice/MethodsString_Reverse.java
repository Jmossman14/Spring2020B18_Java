package Replits_Practice;
/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tnedust"
 */

public class MethodsString_Reverse {
    public static String reverse(String input)
    {
        String ss="";
        for(int i=input.length()-1;i>=0;i--){
            ss+=input.charAt(i);
        }
        return ss;
    }
}
