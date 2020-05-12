package Day37_Construct;

public class InstanceBlock {
    // static block, compiler runs first ALWAYS no matter where it is placed and 1 time
    static{
        System.out.println("static block");
        // can only execute 1 time, and will print on the console once
    }

    //Instance block, compiler runs second and 1 time
    {
        System.out.println("Instance block");
        // must create an object (main method - > obj) for this to get executed
    }

    // objects are created for the instance blocks
    public static void main(String[] args) {
        // will allow the instance block above to be executed
        // will execute as many objects that are created
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();

    }
}
