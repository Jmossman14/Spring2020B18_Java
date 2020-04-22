package Day17_While_DoWhile_Loop;
import java.util.Scanner;
public class WhileLoop_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter, Yes or No");
        String answer = scan.nextLine();

        boolean valid = answer.equalsIgnoreCase("No")|| answer.equalsIgnoreCase("Yes");

        while(!valid){ // if answer is not YES OR NO, it will keep asking user to input
            System.out.println("please re-enter");
            answer = scan.nextLine();
            if(valid){
                System.out.println("Welcome");
                break;}}
        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        }

        if(answer.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }
            }
       }