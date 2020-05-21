package Day43_MethodOverriding.WarmUp;

public class WarmUp_Circle extends WarmUp_Shape { // sub class
 // inherits methods and variables from Shape class:

    //instance methods for this class:
    public double radius;
    // static since PI never changes
    public static double PI = 3.14;

    //create a constructor so it can execute when the object is created:
    public WarmUp_Circle(double radius){
        this.radius = radius; // localizes the radius method
    }

}
