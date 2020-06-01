package Day46_Final_Abstract;

class Test{ // super class
// what methods can be overridden? Instance methods

    public void method1(){ // public can be inherited in sub class
        System.out.println("A ");

    }

    public final void method2(){ //final cannot be overriden or changed in another class
        System.out.println("A ");

    }



}
//=================================================================================
public class Final_method2 extends Test { // sub class
    // method overriding happens in the sub class
    @Override
    public void method1(){ // must use SAME or more visible accessModifier
        System.out.println("B"); // changes the statement from A to B by overriding
    }

   /* public final void method2(){ // cannot be overriden
        System.out.println("B"); // DOES NOT change the statement from A to B
    } */

    // public, protected, default, private





}


