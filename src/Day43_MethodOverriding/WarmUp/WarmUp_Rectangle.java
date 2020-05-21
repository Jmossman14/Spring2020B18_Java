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
    // OVERRIDE Methods from Shape class (super class)
    public void CalculateArea(){
        area = length * width;
        System.out.println("Area of the rectangle is: "+area);
    }
    public void CalculatePerimeter(){
        perimeter = (width + length) * 2;
        System.out.println("Perimeter of the rectangle is: "+perimeter);
    }





}
