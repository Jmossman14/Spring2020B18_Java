package OfficeHours._03_18_2020;

public class UnaryOperators_Practice {
    /* Post Increment / Decrement: Outputs the CURRENT VALUE, then
        Changes number of the value by + or - 1
     */

    public static void main(String[] args) {
        int a = 20;
        System.out.println(a++); // will output 20, then the next time a is used,
                                // value is 21
        System.out.println(a++); // now 21 and next will be 22 and etc.

        int e = 20;
        System.out.println(a--); // will output 20, then the next time a is used,
                                 // value is 19
        System.out.println(a--); // now 19 and next will be 18 and etc.


        int b = 30; // will output 30 - 1, since it is assigning it to another data
                    // right away
        int c = b--; // will output 30 ,

        System.out.println(b); // 29
        System.out.println(c); // 30
         /* PRE Increment / Decrement: Outputs the CURRENT VALUE, and
        Changes number of the value by + or - 1 IMMEDIATELY
     */
        int x = 200;
        System.out.println( --x);
            // ^ outputs 199
        System.out.println(++x);
            // ^ outputs 200; it took 199 & then added 1

        int z = 100;
         //              Post + Pre - Post + Pre
        // Value of z =  100  + 101 - 100  + 99
                    z =  z++  + --z - z--  + ++z;
         //Post/Pre z =  100  + 100 - 100  + 100 = 200
        System.out.println(z);

        int u = 900;
        // value of u = 901 ,  902 ,  903
                int r = - ++u + ++u + -u++;
        //Post/Pre zu = -901 + 902 + -902 = - 901
        System.out.println(r);


    }

}
