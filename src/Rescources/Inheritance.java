package Rescources;
/*
    //create a public data: for everyone and anyone can accesss anytime, anywhere
    public static String publicData = "public";

    //create a protected data: visible in same package and visible in sub class outside package
    protected static String protectedData = "Protected";

    //create a default data:visible in same package
    static String defaultData = "default";

    //create a private data: on;ly visible in same class
    private String privateData = "private";
 */

// can this class use "extend" to inherit the class in another package? YES
import Day42_Inherited.Data;
import Day42_Inherited.TestData;

public class Inheritance extends Data {
    //Super class is: DATA
    //Sub class is: Inheritance
    public static void main(String[] args) {
      //  - they are inherited as they are built; static or instances
      //  - static can be called through the class name

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
       // System.out.println(Inheritance.defaultData); < - will not compile because it can only be used in the same PACKAGE
        // System.out.println(Inheritance.privateData); < -  will not compile since this is a private data type
        // private can never be inherited


    }
}
