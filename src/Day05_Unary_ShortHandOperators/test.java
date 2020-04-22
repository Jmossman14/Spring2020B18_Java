package Day05_Unary_ShortHandOperators;

public class test {
    public static void main(String[] args) {
        long a = 3_000L;
        double b = (float)a;
        int c = (short) b;
        System.out.println(c%1000);
        System.out.println(10/3.0);
        System.out.println (  (int)(10.0/3)   );

        int  x =  10;

        int  y =  x++;

        System.out.println( y++  + "  " +  x++  + "  " + y);

        long  aa = 30L;

        long  bb = (short) aa;
        System.out.println(bb);


    }
}
