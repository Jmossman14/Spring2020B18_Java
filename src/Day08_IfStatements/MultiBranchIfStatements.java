package Day08_IfStatements;

public class MultiBranchIfStatements {
    public static void main(String[] args) {
        int a = 100;

        boolean zero = a == 0;
        boolean negative = a < 0;
        boolean positive = a > 0;

        if (zero) {
            System.out.println("Zero");
        }
        if (negative) {
            System.out.println("negative");
        }
        if (positive) {
            System.out.println("positive");
        }
        //APPLY MULTI BRANCH IF
    }



    }
