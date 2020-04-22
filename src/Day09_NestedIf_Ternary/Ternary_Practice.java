package Day09_NestedIf_Ternary;

public class Ternary_Practice {
    /* - if the IF STATEMENTS is returning a value and assigning it to a variable
            then we can apply ternary
          - ? = IF
          - : = ELSE
          - MUST declare another STRING variable
           single IF & Else*VARIABLE  + ?(IF) + "RESULT" + :(Else) + "RESULT"*
           Multiple ELSE*
            VARIABLE  + ?(IF) + :(Else If) VARIABLE  + ?(IF) "RESULT" + :(Else) + "RESULT"*
          - then create a print statement w/ string variable */
    //                VARIABLE  + ?(IF) + "RESULT" + :(Else) + "RESULT"
    public static void main(String[] args) {
        // CHAR EXAMPLE
        // char ch1 = '+'; // will print PLUS SIGN when using ' '
        char ch1 = ' ';
        int number = 100;
        if(number >0){
            ch1 = '+';}
        else if(number <0)
            { ch1 = '-';}
        else{ ch1 = '0';}
        //TERNARY
        char ch2 = (number > 0) ? '+': (number <0) ? '-' : '0';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("========================");

        byte Score = 85;
        String Grade = "";
        if(Score >= 90 && Score <= 100){
            Grade = "Excellent";
        }else if (Score >= 80 && Score < 90){
            Grade = "Great";
        }else if(Score >= 70 && Score < 80){
            Grade = "Good";
        }else if(Score >= 60 && Score < 70){
            Grade = "Pass";
        }else if(Score < 60 && Score > 0){
            Grade = "Failed";
        }else { // if score is less than 0 or greater than 100
            Grade = "Invalid";
        }
        System.out.println(Grade);

        // TERNARY
        String Grade2 = (Score >= 90 && Score <= 100) ? "Excellent" :
                (Score >= 80 && Score < 90) ? "Great" : (Score >= 70 && Score < 80) ?
                        "Good" : (Score >= 60 && Score < 70) ? "Pass" : (Score < 60 && Score > 0) ?
                        "Failed" : "Invalid";
        System.out.println(Grade2);

        System.out.println("========================");
        // CANNOT USE TERNARY
            // if using SOUT, cannot use TERNARY
        int num = 1000;
        if(num % 2 == 0){
            System.out.println("Even #");
        } else{
            System.out.println("Odd");}





}
    }