package Day02_Variables;

public class Variables {
    public static void main(String[] args) {
        /*Declare variables:
    DataType VariableName = Data;
 */
        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        // Byte cannot exceed 127 //
        // Byte cannot cover decimals only whole #s //


        short num3 = 1000;
        System.out.println(num3);
        // Short cannot exceed 37000 //
        // Byte cannot cover decimals only whole #s //

        int n1 = 20000;
        System.out.println(n1);
        // INT: Compiler prefers INT premative //
        // INT covers 2 billion //

        long n3 = 999999999999l;
        System.out.println(n3);
        // Long: larger than INT, covers over 2 billion, MUST add "L" at the end of an
        // in order for it to be LONG instead of INT
        // forecefully telling compiler that this is a long data #

        double d1 = 3.5;
        System.out.println(d1);
        // Double: preferred premative for compiler for DECIMAL #s.

        float s2 = 5.5F;
        System.out.println(s2);
        //Float: same as double with different range, however NEED to add "F" or else
        // compiler will recognize as a double//

        //float pi = 3.14F;
        //double p = 3.14F;
        //int a1 = 3000;
        //double d2 = a1;


    }
}
 // Double > Float > Long > Int > Short > Byte