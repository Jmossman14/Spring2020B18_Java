package Day20_ArraysContinue;
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};  // size: 7,  max index: 6

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num  =  input.nextInt();  // 18

        int attepmts = 1;
        while(num >7 || num < 1){

            System.out.println("Invalid Entry, please re enter the number");
            num = input.nextInt();  // 6
            attepmts++;

            if(attepmts == 3 && (num >7 || num < 1) ){
                System.exit(0);
            }
        }
        String result =  days[num-1];

        System.out.println(result);


    }
}
