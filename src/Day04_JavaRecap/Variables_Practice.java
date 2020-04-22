package Day04_JavaRecap;

import sun.font.TrueTypeFont;

public class Variables_Practice {
    public static void main(String[] args) {
        //DataType VariableName = Data/value; (Data depends on what DataType is

        byte num1 = 127;
        short num2 = num1; // Byte can go into short because its "smaller"

        int num3 = 12345678;
        long num4 = 99999999999L; // Must add L at the end, can also = num3

        float num5 = 0.5F;
        double num6 = 1.2;

        char ch1 = '$'; //  every single character has a corresponding number
        System.out.println(ch1);

        char ch2 = 22000; // 0 - 65,565
        char a1 = '8'; // 8 = 56
        System.out.println(ch2 + a1);

        int a11 = a1; //
        System.out.println(a11);

        boolean BB = true;
        boolean CC = false;
        System.out.println(19< 17); // false
        System.out.println( 18 >= 18); // true
        System.out.println('a'== 'b'); // false
        System.out.println('c'== 'c'); // true
        System.out.println(!true == false);
        System.out.println(!false != !false);




            /*
        Comparision Operators:
				> : greater
                >= : greater or equal
                < : less
                <= : less or equal
                == : equal
                != : not equal
                 ! : opposite // ! True = False or ! False = True
                              */


    }


}
