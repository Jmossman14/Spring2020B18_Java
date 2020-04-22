package Day05_Unary_ShortHandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        /* shows IMPLICIT CASTING*/
        int a = 10;
        long b = (long) a;
        // *Manually* (long) allows a to be casted into a long variable
        // long b = a; is the automatic version
        System.out.println(b);

        /* Shows EXPLICIT casting*/
        int aa = 100;
        byte bb = (byte) aa; // (Primitive) needs to be same or smaller than data type
        System.out.println(bb);
        // example:
        double num = 5.5;
        float num2 = (float) num;
        System.out.println(num2);
        System.out.println(num2 + num);
        // *when you cast a whole # to decimal, java will disregard the decimal
        // but still output a decimal; 5.5 will become 5.0
        int ab = 5;
        float abb = 5.5f;
        float cc = (int) ab;
        System.out.println(cc);
        // *when you cast a decimal # to whole, java will disregard the decimal
        // and will output whole #
        float F1 = 60.5F;
        int I1 = (int)F1;
        System.out.println(I1);
        // CHAR to short
        char ch1 = 'a';
        short sh1 = (short) ch1;
        System.out.println( sh1);







    }
}
