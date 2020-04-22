package Day06_Shorthnd_LogisticsOperators;

public class ShortHandOperator {
    public static void main(String[] args) {
        //ADDITION +=
        int x = 20;
        x+=10; // executes addition of 10 to the x variable
                // x = 20 + 10 = 30
        System.out.println(x);
        x+=60;
        System.out.println(x);
        // JAVA READS ALL SHORTCUTS FROM TOP TO BOTTOM
        // ADDED 10 + 60 + VARIABLE OF X WHICH IS 20
        String schoolname = "Cybertek";
            schoolname += 12345; // schoolname variable (Cybertek) + 12345
        System.out.println(schoolname);

        // CHAR EXAMPLES
        System.out.println('a'+'b'); // output a #
        //char characters   97 + 98 = 195

        char ch1 = 'a';
            ch1 += 'b';
        System.out.println(ch1); // will output a character

        // INT VS CHAR
        int NUM = 'z'; // Z is read as the # in ascii table
            NUM += 'x';
        System.out.println(NUM);
        System.out.println("==================================");

        //SUBTRACTION -=
        int A = 100;
            A -= 90; // A now = 10
        System.out.println(A);
        int B = 200;
            B -= A; // A = 10
        System.out.println(B);
        System.out.println("==================================");
        // MULTIPLICATION *=
        int AA = 2;
            AA *= 3; // AA now = 6 (2 *3)
        System.out.println(AA);
        int bb = AA *= 10; // AA = 6 * 10
        System.out.println(bb);
        int a1 = 100;
        int b1 = (a1 *= 2) + ++a1;
        // 100 * 2 = 200
        // 200 + ++ a1 = 401
        // b1 = 401
        System.out.println(b1);
        int x1 = 10;
                int y = x1 +=10*2;
                    // x1 + 20
        // 10 + 20 = 30
        System.out.println(y);

        int q = 20;
        int p = q*=20*3;
        // 20 * 3 = 60
        // q * 60 = 1200
        System.out.println(p);
        System.out.println("==================================");

        // DIVISION
        int a = 6;
            a /= 2;
        System.out.println(a);
        int num1 = 300;
        num1 /= 2; // 300 / 2 = 150
        System.out.println(num1);
        int num2 = 400;
            num2 /= 20 + 10;
            // num2 = 400 / 20 + 10 (must add first then divide)
            // 400 / 30
        System.out.println(num2);
    // % REMAINDER ASSIGNMENT
            int aa = 100;
                aa %= 10; // Remainder gives left over or decimal # that # divided
                    // by variable wouldve given
                // if no remainder, it outputs a 0
        System.out.println(aa);
        int num3 = 300;
        num3 %= 10 + 20; // 300 % 30 = 0 because no remainder
        System.out.println(num3);
        int n1 = 400;
            n1 %= 3*5; // 400 / 15 = 26.666
        // REMAINDER: 400 - ( 15*26) = 10
        System.out.println(n1);



    }
}
