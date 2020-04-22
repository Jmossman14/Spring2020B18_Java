package Day18_nestedLoops;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        // WHILE NESTED LOOP

        // initialize
        for (int i = 1; i <= 6; i++) {

            int a = 1; // initialize, must be inside the outter loop
            while (a <= 6) {// condition
                System.out.print("*");
                a++; // iterator

            }
            System.out.println();
        }
        /* OUTPUT:
         *******
         *******
         *******
         *******
         *******
         *******
         *******
         */
        System.out.println("=========================================");
        /* Task: Create a triangle
            - create the base first using the inner loop to create 5 * going left and right
            - create outter loop to create 5 * going up and down
               // must use outter loop B as the condition, so inner loop A will increase with B
                    //when b = 1, a = 1, when be = 2, a = 2, when b =3, a = 3, ect.
                    // creating a new line with the same amount of * each loop
                    // verticle line = b #
                    // horizontal line = a #
         *
         * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         * * * * * * * * * *
         */
        for (int b = 1; b <= 9; b++) {

            for (int a = 1; a <= b; a++) {// INNER LOOP
                System.out.print("* ");// PRINT so you can create ***** on one line

            }

            System.out.println();// breaks line every OUTTER loop
        }
        System.out.println("=========================================");
        // REVERSE THE ABOVE TRIANGLE, variables do not change!
        for (int b = 9; b >= 1; b--) { // OUTTER loop is the opposite from above

            for (int a = 1; a <= b; a++) {// INNER LOOP doesnt change
                System.out.print("* ");// PRINT so you can create *s on one line

            }

            System.out.println();// breaks line every OUTTER loop
        }
        System.out.println("=========================================");
    }
}
