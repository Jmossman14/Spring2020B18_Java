package Replits_Practice;
/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */
import java.util.Scanner;

public class SandwichLoop_95 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next(), between = "nothing";

            if (str.indexOf("bread") != -1 )
                if(str.lastIndexOf("bread") != str.indexOf("bread"))
                    between = str.substring(str.indexOf("bread") + 5,  str.lastIndexOf("bread"));

            System.out.println(between);
        }


    }






