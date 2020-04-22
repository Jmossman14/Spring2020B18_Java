package Day09_NestedIf_Ternary;

public class NestedIf_Practice {
    public static void main(String[] args) {


    byte workhistory = 3;
    double salary = 25000;

    if(salary >= 30000) { // might be qualified
        if (workhistory >= 2) { // this needs to be tru as well as precondition in ordr to be qualified
            System.out.println("Qualified for loan");
        } else {
            System.out.println("You must have at least 2 years on the job");}

    }else{
        System.out.println("30,000 is the min amount you need to make");
    }








}}
