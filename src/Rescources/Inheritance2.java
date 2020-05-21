package Rescources;

import Day42_Inherited.AccessModifiers;


public class Inheritance2 extends AccessModifiers {
    public static void main(String[] args) {

// ONLY PUBLIC AND PROTECTED VARIABLES & METHODS CAN BE USED OUTSIDE OF THE PACKAGE
        System.out.println(Inheritance2.publicVariable);
        System.out.println(Inheritance2.protectedVariable);
        // will not compile -> System.out.println(Inheritance2.defaultVariable);

        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();


    }
}
