package Day29_Wrapper_ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

/*
ValueOf: Converting STRING to a wrapper class

Primitive.valueOf(VariableName)
                            String  =====> Integer
                            "123"           123
valueOf method Boolean: any string other thant TRUE or FALSE will
            ALWAYS return FALSE

 */
public class ValueOf_Methods {
    public static void main(String[] args) {
// String
        String str = "123";

        Integer a = Integer.valueOf(str); // Integer, 123
        System.out.println(a); // 123

        double  b = Integer.valueOf(str);
        System.out.println(b);// 123.0

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        double d2 = Double.valueOf(str2);
                            // double == double // unboxing method
        System.out.println(d1 == d2);

        // =============================================

        System.out.println("========================");
         /*
        "true" - boolean
        "FAlSe" - boolean
        "10000000000.5" - to float
        " 123456" - short
         */

        String txt1 = "True";
        Boolean b1 = Boolean.valueOf(txt1);
        // Boolean == Boolean // no boxing
        System.out.println(b1);
        boolean bb1 = Boolean.valueOf(txt1);
        // boolean == Boolean // unboxing
        System.out.println(bb1);

        //=======================

        String txt2 = "FAlSe";
        boolean b2 = Boolean.parseBoolean(txt2);
        System.out.println(b2);

        String num1 = "1000000000.5";
        double l1 = Double.parseDouble(num1);
        System.out.println(l1);

        String num2 = "123456";
        int i1 = Integer.parseInt(num2);
        System.out.println(i1);

        // ==============================
        // MAX Nums - will output the max num of the data type

         int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        // MIN nums - will output min num of the data type

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2);


    }
}
