package Day29_Wrapper_ArrayList;


/*
        Parse Methods:
                    Converts STRING of text to a primitive
                             String  =====> int
                            "123"           123
     Steps:
        - Integer.parseInt(variableName);

Parse method Boolean: any string other thant TRUE or FALSE will
            ALWAYS return FALSE
         */
public class Parse_ValueOf {
    public static void main(String[] args) {
        // convert String to Int
        String str = "123";
        System.out.println(str); // text

        int a1 = Integer.parseInt(str); // outputs 123
        System.out.println(a1); // number

        System.out.println(str+1 );// 1231 (concats as text)
        System.out.println(a1+1); // 123 + 1 == 124 (adds #s)

        // ========================================================
        // converts String to Byte
        String str2 = "123";
        System.out.println(str2); // text

        byte byte1 = Byte.parseByte(str2);
        System.out.println(byte1); // number

        System.out.println(byte1 + 5);

        Integer I1 = (int) Byte.parseByte(str2); // explicit casting used to
                    // allow Integer wrapper to accept another primitive
//===========================================================================
        // converts String to Float & double
        String str3 = "10.5"; // text

        float f1 = Float.parseFloat(str3); // number
        System.out.println(f1 + 1); // 10.5 + 1 => 11.5

        double d1 = Double.parseDouble(str3); // number
        System.out.println(d1 + 1); // 10.5 + 1 => 11.5

        //==========================================
            // convert String to Long
        String str4 = "3147483647"; // text
        long l1 = Long.parseLong(str4); // unboxing
        System.out.println(l1); // outputs a number => 3147483647
        System.out.println(l1+2); // 3147483647 + 2 = 3147483649

        Long l2 = Long.parseLong(str4); // autoboxing
        System.out.println(l2);

        //============================================
        // convert string to Boolean
            // if string result isn't True or False, it will return FALSE
        String result1 = "true";
        boolean b1 = Boolean.parseBoolean(result1); // outputs Boolean (true or false)
        System.out.println(b1); //

        //=========================================
        // convert string to a boolean
            // compiler ignores case sensitivty
        String result2 = "faLsE"; // false
        boolean b2 = Boolean.parseBoolean(result2);
        System.out.println(b2);

    }
}
