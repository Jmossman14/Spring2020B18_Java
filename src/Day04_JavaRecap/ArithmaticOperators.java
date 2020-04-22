package Day04_JavaRecap;

public class ArithmaticOperators {
    public static void main(String[] args) {
    // 10/3 = 2 if using INT it will show whole #
        int a = 10/4;
        System.out.println( a);
    // 10/3 = 3.333 if using DBL it will show decimals
        double b = 10/4.0; // 10.0 or 4.0 to output a decimal #
        System.out.println(b);
        System.out.println(10.0/4.0); // will output decimal
        float F = 10/4.0F;
        System.out.println(F);

        // 25 is odd or even

        boolean evenNumber = 25 %2 == 0; // if 25/2 has a remainder of 0, the it is true
                                    // if there is a remainder than it is false
        boolean OddNumber = 22 % 2 != 0;
        System.out.println(OddNumber);
        System.out.println(evenNumber);

        System.out.println( 10 % 2 == 0);

        System.out.println("10 is even number: " + ( 10% 2 == 0));
        System.out.println("25 is even number:" + !(25%2!=0));
                                        //^ used ! in order to show opposite to reflect false


    }
}
