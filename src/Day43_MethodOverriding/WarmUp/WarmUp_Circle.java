package Day43_MethodOverriding.WarmUp;

public class WarmUp_Circle extends WarmUp_Shape { // sub class
    /*
    Inherits:
            public double area;
             public double perimeter;
             CalculateArea();
             CalculatePerimeter();
     */


    public double radius;
    public static double PI = 3.14;

    //create a constructor so it can execute when the object is created:
    public WarmUp_Circle(double radius){
        this.radius = radius; // localizes the radius method

    }

    // override the Area and Perimeter methods:
    // allows you to change the fuctionalities(statements) of a method from the super class
    public void CalculateArea(){
        area = radius * radius * PI;
        System.out.println("Area of the circle is: "+area);
    }
    public void CalculatePerimeter(){
        perimeter = radius * 2 * PI;
        System.out.println("Perimeter of the circle is: "+perimeter);
    }


}
