package Day07_IfStatements;

public class If_Else_Statments {
    public static void main(String[] args) {
        int number = 1;
        if (number >= 1) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }
        // else combines 2 statements instead of using 2 IF statements
        //if(number < 0){System.out.println(number+" is negative");
        int num = 100;
        if (num % 2 == 0) {
            System.out.println(num + " is even #");
        } else {
            System.out.println(num + " is odd #");
        }
        //
        int age = 30;
        if (age >= 21) {
            System.out.println("Here is your vodka");
        } else {
            System.out.println("Go home kids!");}

        boolean TestedPositiveForCorona = true;
        if(TestedPositiveForCorona){
            System.out.println("Buy more toilet paper and stay home");}
        else {System.out.println("Do more coding");}





    }
}