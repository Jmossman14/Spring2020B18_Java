package OfficeHours._03_18_2020;

public class ShortHandOperators_Practice {
    public static void main(String[] args) {

        // +=: addition assignment
        int a = 100;
        a += 200; //   a = a + 200;
        System.out.println(a);
        a += 200 * 3; // 200 * 3 = 600 + 300 (which is the output of a now) = 900
        System.out.println(a);

        // -= subtraction assignment
        a -= 400; // a = a - 400
        System.out.println(a); // output is 900, so 900 - 400 = 500

        int b = 300;
        b -= 3 * 40; // 3 * 40 = 120, 300 (b) - 120 = 180
        System.out.println(b);

        // *=: multiplication assignment
        int x = 5;
            x *= 3; //x = x * 3
        System.out.println(x);
            x *= 2+1;// 2+1 = 3 * 15 which is x output
        System.out.println(x);
        // /=: division assignment
        int n = 900;
            n /= 3;// n = n / 3 which is 300
        System.out.println(n);
            n /= 3*5; // 3 * 5 = 15,  15 / by 300 (n) -= 20
        System.out.println(n);
        // %= Remainder assignment
        // FORMULA = numerator - (denominator * whole # of result)
        //           10 - (3 *3), 10 - (9), = 1 <--remainder
        int m = 10;
            m %= 3; //m = m % 3;1 <--remainder
        System.out.println(m);
        int y = 300;
            y %= 3*5; // 3 * 5 = 15 / 300 % 15 = 20, since
                        // no remainder, output is 0
        System.out.println(y);
        int t = 400;
            t %= 10*2; // 10 * 2 = 20 , 400 / 20 = 20, so output is 0 since no remainder
        System.out.println(t);


    }
}
