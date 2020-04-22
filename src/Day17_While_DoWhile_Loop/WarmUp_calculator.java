package Day17_While_DoWhile_Loop;
/*
  3.  write a program that can calculate the two numbers based on the user
  provided operators, the program will ask:
             1. enter first number
                2. enter the second number
               3. enter the math operators
                  (assume that only the +, -, *, /, and % will be entered)
      then the system will give the result based on the operator
         at the end it will ask if the user want's to calculate another numbers, if user
          entered "NO" or "no", the program will stop execution,
          otherwise it repeats all the previous steps
           (you will need a lop that has true condition without the iterator)

 */

import java.util.Scanner;

public class WarmUp_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum =0;
        for(int a = 0; true; a ++) { // infinite loop, unless user says NO to "do you want to continnue"

            System.out.println("Enter first number");
            int num1 = scan.nextInt();
            System.out.println("Enter second number");
            int num2 = scan.nextInt();
            System.out.println("Enter +, -, *, / ");
            String operator = scan.next();

            if (operator.equals("+")) {
                sum += num1 + num2;
            } else if (operator.equals("-")) {
                sum += num1 / num2;
            } else if (operator.equals("*")) {
                sum += num1 * num2;
            } else if (operator.equals("/")) {
                sum += num1 / num2;
            } else if (operator.equals("%")) {
                sum += num1 % num2;
            } else {
                System.out.println("Invalid operator");
            }

            System.out.println("The answer is "+sum);

        System.out.println("Do you want to continue?");
        String answer = scan.next();
        if(answer.equalsIgnoreCase("no")){
            System.out.println("come back again :)");
            break;
        }
    }
}}

