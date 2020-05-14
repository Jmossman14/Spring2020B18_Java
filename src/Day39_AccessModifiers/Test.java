package Day39_AccessModifiers;

public class Test {


    public static void main(String[] args) {
        // create access to see if you can get access to defaultAccess & publicAccess from AccessModifiers Class:
            AccessModifiers obj1 = new AccessModifiers();
            System.out.println(obj1.defaultAccess);
            System.out.println(obj1.publicAccess);
           // System.out.println(obj1.SSN); // cannot access since this is a PRIVATE


    }
}
