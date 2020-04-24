package Replits_Practice;
/*
This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table
 */
public class Methods_Return_3Locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        boolean result = true;
        if (a == true && b == true || c == true) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean result = threeLocks(true, false, true);
        System.out.println(result);
    }
}
