package Day23_Methods;
/*
Create a function that can reverse any string
 */
import java.util.Scanner;
public class ReverseString_MethodsParameters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String txt = input.nextLine();
        ReverseString(txt);

    }


    public static void ReverseString(String txt){
        for(int i = txt.length()-1; i>=0;i--){
            System.out.print(txt.charAt(i));
        }
    }


}
