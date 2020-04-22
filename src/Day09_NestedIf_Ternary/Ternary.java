package Day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result = " ";

        if(num %2 == 0){
        result = "Even";}
        else{result = "odd";}

        /* - if the IF STATEMENTS is returning a value and assigning it to a variable
             then we can apply ternary
           - ? = IF
           - : = ELSE
           - MUST declare another STRING variable
            *VARIABLE  + ?(IF) + "RESULT" + :(Else) + "RESULT"*
           - then create a print statement w/ string variable */
        //                VARIABLE  + ?(IF) + "RESULT" + :(Else) + "RESULT"
        String result2 = (num % 2 == 0) ? "Even" : "odd";
        System.out.println(result2);
        System.out.println("==============================================");

        int num1 = 100;
        int num2 = 200;
        int max = 0;


    }}
