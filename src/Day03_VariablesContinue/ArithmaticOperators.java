package Day03_VariablesContinue;

public class ArithmaticOperators {

    public static void main(String[] args) {
        /* + : addition
           - : subtraction
           * : multiplication
           / : division
           % : remainder; Ex:
                10 / 4 = 2.5 (.5 is the remainder)
                numerator - (Denominator * result of whole #)
                10 - (4*2) = 2
         */

        System.out.println( 5+3); // 8
        System.out.println( 10 - 2); // 8
        System.out.println( 10 * 3); // 30
        System.out.println( 10 / 2); // 5 * cannot use 0 as denominator
                                    // or java will give error
        System.out.println(10 % 4); // % will do the entire formula and produce remainder
        System.out.println(10 % 3);




    }
}
