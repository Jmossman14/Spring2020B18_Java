package Day18_nestedLoops;
/*
Do{}While(): Prints statement once THAN checks condition, if TRUE it prints again - if FALSE then exits
 */
public class Do_While_Loop {
    public static void main(String[] args) {
        int i = 5;

        do {
            System.out.println("Hello");
        } while (1 == 0);// even though its false, statement will still print once

    }
}