package Day42_Inherited;
// how to declare a constructor:
//               AccessModifier and class name

// Test class:
class Test{ // SUPER CLASS (parent) -> can extend to child

    public Test(){ // default constructor
        System.out.println("super class' default constructor");
    }
}

//Constructor Class:
public class Constructor extends Test { // SUB CLASS (child) -> inherits parent, but cannot extend to parent
    public Constructor(){ // executes the constructor from Test class
        System.out.println("sub class' default constructor");
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(); // <-- calls the defauly constructor
        System.out.println(obj1);
    }
}
