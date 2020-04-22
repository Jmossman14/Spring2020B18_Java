package Replits_Practice;
import java.util.Scanner;
/*
using substring method output the first two letters of text string
for example:
String txt = "foo"
the first two letters are "fo"
use print not println.

 */
public class Substring_ {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String txt2 = txt.substring(0, 2);
        System.out.print(txt2);

    }
}
