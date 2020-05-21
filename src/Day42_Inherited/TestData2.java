package Day42_Inherited;

import Rescources.Inheritance2;

public class TestData2 extends AccessModifiers {
   /*
 this is what is inherited from AccessModifiers
    //public variable
    public String publicVariable = "public";

    //protected variable
    protected String protectedVariable = "protected";

    //default variable
    String defaultVariable = "default";

    //private variable
    private String privateVariable = "private";

    public static void publicMethod(){


    }
    protected static void protectedMethod(){


    }
    static void defaultMethod(){

    }
    private static void privateMethod(){


    }
    */
    public static void main(String[] args) {
// ONLY PUBLIC AND PROTECTED & DEFAULT VARIABLES & METHODS CAN BE USED OUTSIDE OF THE PACKAGE

        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        // will not compile -> System.out.println(TestData2.defaultVariable);
        TestData2.publicMethod();
        TestData2.protectedMethod();
        TestData2.defaultMethod();


    }

}
