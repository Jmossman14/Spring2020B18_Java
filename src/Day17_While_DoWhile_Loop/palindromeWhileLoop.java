package Day17_While_DoWhile_Loop;

public class palindromeWhileLoop {
    public static void main(String[] args) {
        String str = "Java";
        String reversedStr = ""; // store the reversed version of str

        int index = str.length() - 1; // last index #

        while(index >= 0){ // allows compiler to start count from the last index # to 0
                reversedStr += str.charAt(index);
            index --; // allows compiler to decrease index # to 0
    }
        boolean palindrome = reversedStr.equalsIgnoreCase(str);

        System.out.println(palindrome);

}}
