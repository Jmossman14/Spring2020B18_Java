package Day10_Siwtch_Scanner;
/*
Switch: Compares values of a variable
Break: Exits switch statement once executed, anything after BREAK will not be executed
Default: None of the cases match the expression
- Expression cannot be TRUE or FALSE
- caseValue must match the expression, # -> # && word -> word
- you can have multiple cases in a single switch statement
-Compiler checks CASES before DEFAULT

 */
public class SwitchStatement {
    public static void main(String[] args) {
        // MUST BE CHARACTER, # OR TEXT
        byte a = 4;
        //NOT ACCEPTED IN SWITCH STATEMENT
         /*float a1 = 4.5f;
        long a2 = 10l;
        double a3 = 2.5d;
        boolean a4 = true;*/

        switch(4){ // cannot use True or False (boolean)
            case 1: // if i change the 1 to 4, then it will output this case
                System.out.println("One");
                break; // compiler will exit statement IF this case if correct
            // if not correct it moves on to next case to check if it matches expression
            case 2:
                System.out.println("Two");
                break;
            default: // default can be placed any where in the switch statement
                System.out.println("Invalid Case");
        }





    }








}
