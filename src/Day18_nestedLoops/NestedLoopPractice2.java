package Day18_nestedLoops;
import java.util.Scanner;
/*TASK:
create a calculator that can add two #s and outputs the sum
calculator must ask if the user wants to continue, YES or NO
if NO, then exit
if YES, then continue to LOOP calculator
if any other entry, INVALID ENTRY & re-enter
 */

public class NestedLoopPractice2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        while(true) { // while the below is true, program will keep  LOOPING
            System.out.println("Enter two numbers: ");
            // below allows user to input 2 numbers on 2 separate lines
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));//outputs sum
            System.out.println("Do you want to continue");
            String answer = input.next();// user must say YES OR NO, if NO then program will stop

            while(!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("no"))){
                // if answer DOES NOT (!) = YES or NO, there is an error:
                System.out.println("Invalid Entry! Enter 'Yes' to continue or 'No' to exit:");
                         answer = input.next();
            }

            if(answer.equalsIgnoreCase("No")){ // allows user to exit program
                System.out.println("Thank you for using the calculator");
                break;
            }
        }
        /* output:
        Enter two numbers:
            1
            1
        Addition of two numbers: 2
        Do you want to continue
            idk
        Invalid Entry! Enter 'Yes' to continue or 'No' to exit:
            yes
        Enter two numbers:
            2
            2
        Addition of two numbers: 4
        Do you want to continue
            no
        Thank you for using the calculator

         */
    }
}
