package Replits_Practice;
/*
uniqueChars is a method that you will code now,
should be able to accept any string in the world and
return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */
public class Methods_Return_Uniques {
    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("BugBusters"));
    }
    public static String uniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;

    }}