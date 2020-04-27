package Day29_Wrapper_ArrayList;
/*
Wrapper Class: classes that are dedicated to each primitives

java.lang

Wrapper variables:
                    Byte, Short, Integer, Long, Float, Double, Character, Boolean.


Structure:
1. Array
2. Collections ==> only accepts objects (coming from a specific class)
3. Maps   ==> only accepts objects (coming from a specific class)

ONLY LOYAL TO ITS PRIMITIVE -> Short cannot be integer // etc.
 */

public class Wrapper {
    public static void main(String[] args) {
        int a = 100; // primitive
        Integer b = 200; // wrapper class
                                    //
        short s1 = 200;
        int n1 = s1;
      // Integer N1 = s1; // Integer is dedicated to INT primitive

       // =============================================================================

       int a1 = 20;
       float f1 = a1;
      //  Float f2 = a1; // Float is dedicated to FLOAT primitive

        Integer I1 = 200;
        int a2 = I1;
        // INTEGER can be casted into int

        Byte B1 = 126;
        int a3 = B1;


    }
}

