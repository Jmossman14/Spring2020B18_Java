package Day09_NestedIf_Ternary;

public class IFStatement_WithoutCurlyBraces {
    //
    public static void main(String[] args) {
        int number = 100;
        if(number % 2 == 0) // no curly braces {} since there is only 1 statement
            System.out.println("Even Number");
        else // no curly braces {} since there is only 1 statement
            System.out.println("Odd Number");

        if(9 < 8){ // NEEDS {} since there is more than 1 statement
                    // will output all of the below statements if TRUE
                    // will not output anything if FALSE
            System.out.println("hello");
            System.out.println("condition is true");
            System.out.println("test executed");
        }




    }
}
