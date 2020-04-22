package Interview_Questions;
import java.util.Scanner;
/*
warmup tasks:
	1. write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
	2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class IQ_Divide2Numbers_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// my way
        /*
        System.out.println("Enter 1st number");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = scan.nextInt();

        boolean divisible = num1 / num2 == 0;


        while (divisible) {
            System.out.println("Numbers are divisible and the answer is: " + (num1 / num2));
            break;
        }
        if(!divisible){
            System.out.println("Invalid"+num1+" is not divisible by");
        }
*/
  /*
     1. write a program that can divide two numbers. ( Assume that first number is greater than the second)
            NOTE: DO NOT USE division, multiplication, or module operators
            10 / 3  ==> 3 with a remainder of 1
            10 - 3 - 3 - 3 = 1

          a = a - b = 7;
          a = a - b = 4;
          a = a - b = 1;

            COUNT =  3;   a = 1;
     */
/*
        public static void main(String[] args) {
            int a = 20;
            int b = 3;
            if(b == 0){
                System.out.println("b cannot be zero");
                System.exit(0);
            }

            int count = 0; // count the execution of the loop

            while( a  >= b){
                a -= b;
                count++;
            }

            if(a == 0) {
                System.out.println("The result is " + count);
            }else{
                System.out.println("The result is " + count+" with a remainder of "+a);
            }





        }
        }
 */
    }
}