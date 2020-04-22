package Day10_Siwtch_Scanner;

public class SwitchStaement_Practice {
    public static void main(String[] args) {
        int days = 1; // DAYS goes into the EXPRESSION of switch!
        // if BREAK is removed from all cases, it will print everything
        // if BREAK is removed from case 1, then case 1 & case 2 will print
        // so on and on, JAVA reads from top to bottom, so anything without BREAK
        // in order will PRINT.
        switch(days){
            case 1:            // # must be the data of expression
                System.out.println("Monday");
                break;      // case is closed, will execute if it is exact data of DATA (days)
                            // if not COMPILER moves on to the next case
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break; }





    }
}
