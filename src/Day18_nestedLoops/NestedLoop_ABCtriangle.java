package Day18_nestedLoops;

public class NestedLoop_ABCtriangle {
    public static void main(String[] args) {
                /*
        Print: Letters Triangle
            - use CHAR to declare variables since output is letters
            - create the base first using the inner loop to create a b c d e going left and right
            - create outter loop to create a b c d e going up and down
               // must use outter loop i as the condition, so inner loop ch will increase with i
                    //when i = a(1), ch = a, when i = a b(2) , ch = a b , when i =a b c, ch = a b c, ect
                    // verticle line = i letters
                    // horizontal line = ch letters
                a
                a b
                a b c
                a b c d
                a b c d e
                etc.... a - z
         */
        for(char i = 'a'; i <='z'; i++) { // use char to output letters
            for (char ch = 'a'; ch <= i; ch++) { // ch <= i,
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        System.out.println("=====================================");
    // REVERSE ABC TRIANGLE:
            for(char i = 'z'; i >= 'a'; i--) { // reverse this loop
                for (char ch = 'a'; ch <= i; ch++) { // INNER LOOP DOES NOT CHANGE
                    System.out.print(ch+" ");
                }
                System.out.println();

            }

    }
}
