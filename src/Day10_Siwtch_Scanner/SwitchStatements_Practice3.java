package Day10_Siwtch_Scanner;

public class SwitchStatements_Practice3 {
    // Swith w/ CHAR
    public static void main(String[] args) {

        char ch = 'A';
        String result = "";// can use this to initialize
                // if NO BREAKS, it will compile letters from top to bottom and output INVALID
                // which becomes a logical error!
               // adding + to the "result +=" will add concatination and output ABCDInvalid
        /* is using " System.out.println(""); " instead of "result" ^^^
            - if NO BREAKS and no cases match
             it will compile letters from top to bottom and output ABCDInvalid
            - if NO BREAKS and a case matches
             it will compile from the matching letter to the
         */
        switch(ch){
            case 'A':
                //System.out.println("A");
                result = "A";


            case 'B':
                //System.out.println("B");
                result = "B";


            case 'C':
                //System.out.println("C");
                result = "C";


            case 'D':
                //System.out.println("D");
                result = "D";


            default:
                //System.out.println("Invalid");
                System.out.println("Invalid");


        }















    }


}
