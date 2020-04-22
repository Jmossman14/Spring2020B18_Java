package Day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
         /* - if the IF STATEMENTS is returning a value and assigning it to a variable
             then we can apply ternary
           - ? = IF
           - : = ELSE
           - total ? and total : used in code need to be equal
           - MUST declare a specific variable based on what you want to output
            *VARIABLE  + ?(IF) + "RESULT" + :(Else) + "RESULT"*
           - then create a print statement w/ string variable */
        //                VARIABLE  + ?(IF) + "RESULT" + :(Else) + "RESULT"
        String result = " ";
        // NORMAL IF
        if(9 > 10){
            result = "9 is greater 10";
        } else{
            result = "10 is greater";
        }
        System.out.println(result);
        // TERNARY IF
        String result2 = (9 > 10) ? "9 is greater 10" :"10 is greater";
        System.out.println(result2);
        System.out.println("=====================");

        // BOOLEAN example
        //Normal IF
        int age = 20;
        boolean Eligable = (age >= 21) ? true : false; //TERNARY
        // NORMAL IF
        /*if(age >= 21){
             Eligable = true;}
           else{
            Eligable = false; */
        System.out.println(Eligable);
        System.out.println("====================");
        // IF vs. Ternary IF using INT and String
        int AgeOfPerson = 20;
        String EligableToVote = "";

        if(AgeOfPerson >= 18){
            EligableToVote = "YES";
        } else {EligableToVote = "NO";}
        System.out.println(EligableToVote);
        String EligableToVote2 = (AgeOfPerson >= 18) ? "YES" : "NO";
        System.out.println(EligableToVote2);


    }
}
