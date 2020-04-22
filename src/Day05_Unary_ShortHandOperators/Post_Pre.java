package Day05_Unary_ShortHandOperators;

public class Post_Pre {
    public static void main(String[] args) {
        // PRE: DOES changes the value of the variable immediately

        int aa = 100;
        System.out.println(aa); // 100
        System.out.println(++aa); // 101

        //POST: DOES NOT changes the value of the variable immediately
        System.out.println(aa ++); // 101

        // EXAMPLES:
        int b = 100;
        System.out.println(b);
        System.out.println(b --);

        //examples

        int z = 10;
        System.out.println(z);
        System.out.println(++z);
        System.out.println(z--);


        int a = 50;
        a = --a + a++ + a-- + a++;
            // Pre -1 = 49 // + Post +1 = 49 // + Post -1 = 50 // + Post +1 = 49 = 197
        System.out.println(a);

        int bb = 1;
        bb = -bb-- + bb++  / -bb-- * --bb;
        //
        System.out.println(bb);
        System.out.println("Result A"+0 +1);
        System.out.println("Result B" +(1)+(2));
        System.out.println("5+2 ="+3+4);
        System.out.println("5+2 ="+(+3+4));
    // question 4
        long v = 30L;
        long s = (short) a;
        System.out.println(s);
    // question 5
       // double a,b,c = 10.5; // error
        // question 6
        float n = 100.987_6543f;
        short m = (byte) n;
        byte j = (byte) m;
        System.out.println(j); // j = 100
        // question 7
        //byte h = 200; // error
        // question 8
        int q = 9, w =0, c = q/w;
        System.out.println(c*w);









    }
}
