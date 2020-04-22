package Day10_Siwtch_Scanner;

public class SwitchStatements_Practice2 {
// using INT, must add SOUT with variable name to print out result!!
    public static void main(String[] args) {
        int num = 0; // since there is NO BREAK statements, the #s are added together
                    // 2+10-5
                    //^ CASE 1 isnt added because it doesnt have a break statement
                    // if NO BREAK; is given, then the NEXT available case will be executed!
        switch(2){
            case 1:
                num += 3;

            case 2:
                num += 2;
             // if break; is here it would execute 2 and num would now = 2
            case 3:
                num +=10;

            default:
                num -= 5;
                break;
        }
        System.out.println(num);




    }
}
