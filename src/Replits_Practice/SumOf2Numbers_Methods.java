package Replits_Practice;
import java.util.Scanner;
/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */
public class SumOf2Numbers_Methods {


    public static void main(String[] args) {

        plus();
    }

    public static void plus() {
// create Scanner inside the new METHOD (plus)
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("result: " + (num + num2));


    }

    }
