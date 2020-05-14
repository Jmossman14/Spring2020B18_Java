package Rescources;

//must use this import statement to import another package into
import Day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {
        // create an object for AccessModifiers class:
        AccessModifiers obj1 = new AccessModifiers();
       // System.out.println(obj1.defaultAccess); // default will not compile, only accessible in same package
        System.out.println(obj1.publicAccess);// public will compile, accepted anywhere
        // System.out.println(obj1.SSN); // default will not compile, only accessible in the same package

    }
}
