package Day21MultiDimensional_Arrays;
/*
DecimalFormat: used for rounding the decimals
presented in: import java.text.DecimalFormat;
 */
import java.text.DecimalFormat;
// import for decimal formatting
public class Formatting_Decimals {
    public static void main(String[] args) {
        // class for decimal format
  // DecimalFormat className = new DecimalFormat();
        DecimalFormat DF = new DecimalFormat("0.00");
            // allows you to format how the decimal number will look
        // if 0.00 then it will output #.##

        double a = 10.0/3.0;

        System.out.println(a);
//  normal output of 3.3333333333333333
        System.out.println(DF.format(a));
//  takes the format we input above (0.00) and outputs 3.33

        System.out.println(2.345125325);
// normal output of 2.345125325
        System.out.println(DF.format(2.345125325));
//  takes the format we input above (0.00) and rounds the 3rd digit to the 2nd and outputs 2.35
    }
}
