package Day43_MethodOverriding.WarmUp;

public class WarmUp_Rectangle extends WarmUp_Shape {
    /*
    Inherits:
            public double area;
             public double perimeter;
             CalculateArea();
             CalculatePerimeter();
     */

    public double length;
    public double width;

    public WarmUp_Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

}
