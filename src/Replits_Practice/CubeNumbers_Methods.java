package Replits_Practice;
/*
Given method called cube. Write all required code inside this method in order
to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */
import java.util.Scanner;
public class CubeNumbers_Methods {
    public static void cube()
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result = (num*num*num);
        System.out.println(result);


    }//end cube

    public static void main(String[] args) {

        cube();

    }

}
