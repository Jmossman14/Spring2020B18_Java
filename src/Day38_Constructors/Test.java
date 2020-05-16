package Day38_Constructors;

public class Test {
    //static block
    static{ // whenever this class is loaded, this block will be executed first and only ONCE - no matter where it is placed in the class
        System.out.println("Static Block");
    }

    //instance Block
    { // instance blocks execution depends on the object, so if NO object it will not execute
        System.out.println("Instance Block");
    }

    //constructor
    public Test(){ // Constructor runs AFTER the instance block, no matter where it is placed in the class
        System.out.println("Constructor");
    }

    // main method
    public static void main(String[] args) {
        System.out.println("Main Method");
        new Test(); //static, instance, constructor
        new Test(); //instance, constructor [ static doesnt print again since it only prints ONCE ]
        /*
        Order will be:
            Static Block
            Main Method
            Instance Block
            Constructor
         */

    }

}
