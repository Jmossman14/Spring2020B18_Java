package Day18_nestedLoops;
/*
Nested loop: a LOOP contained in another LOOP
purpose: to repeat a loop multiple times
***OUTER LOOP repeats the INNER LOOP
When do we use them: Whenever we need the inner loop to be repeated multiple times
for (in z = 1; z <=5; z++){ // repeats the inner loop 5 times and prints 5 more time of the inner
        for(int i = 1; i <=5; i++){ // runs 5 times
        System.out.print(i+",")} // prints 5 times
 */
public class NestedLoop<c> {
    public static void main(String[] args) {
       // OUTTER LOOP
        for(int a = 1; a <=5; a++){ // runs the below FOR LOOP 5 more times
            // INNER LOOP
            for(int i = 1; i <=5; i++) {
                System.out.print(i+" ");// will be printed 5 times on 1 line
        }
            System.out.println();// allows OUTTER LOOP to be printed on separate lines
        }
        // OUTPUT:
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */
        System.out.println("===========================================");
        /* Task:
        ******
        ******
        ******
        ******
        ******
        ******
         */
        // FOR NESTED LOOP
        for(int b = 1; b <=7; b++){
        for(int a = 1; a <= 6; a++){
            System.out.print("*");
        }
            System.out.println();

    }


        }
    }

