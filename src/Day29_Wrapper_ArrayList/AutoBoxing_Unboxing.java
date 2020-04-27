package Day29_Wrapper_ArrayList;
/*
Autoboxing :
        Converts primitives into Wrapper Class object
            int ==> INTEGER

Unboxing :
        Converts Wrapper class into a primitive value
            INTEGER ==> int
 */
public class AutoBoxing_Unboxing {

    public static void main(String[] args) {

        int a = 100; // primitive
        Integer b = a; // converting a primitive into a Wrapper = Autoboxing



        Byte byte1 = 98;
        // Converts Wrapper class into a primitive value = Unboxing
        byte byte2 = byte1;
        short short1 = byte1;
        int int1 = byte1;



    }
}
