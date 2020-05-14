package OfficeHours._05_13_2020;

public class statics {
    // instance variable:
    int instanceVariables = 100;
    //static variable:
    static int staticVariables = 200;

    //instance method: - you can call the static method and variable in this method
    public void instanceMethod(){
        staticMethod();
        System.out.println(staticVariables);
        System.out.println(instanceVariables);
    }


    // static Method: - you can ONLY call static in this method
    public static void staticMethod(){
        //  instanceMethod(); - DOES NOT ACCEPT
       //  System.out.println(instanceVariables);- DOES NOT ACCEPT
        System.out.println(staticVariables);
    }

    //main method: is a class member and only accepts other class members which are STATICS
    public static void main(String[] args) {
        //instanceMethod();- DOES NOT ACCEPT
        //System.out.println(instanceVariables);- DOES NOT ACCEPT
        staticMethod();
        System.out.println(staticVariables);
    }
}
