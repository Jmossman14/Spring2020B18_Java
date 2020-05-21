package Day43_MethodOverriding.WarmUp;

public class WarmUp_Shape { // Super class
       /*
    1. create a class called Shape:
                variables: area, perimeter
                methods: calculateArea(), calculatePerimeter()
    2. create sub classes of ShapeActions:
                Circle
                rectangle
                square
     give the instance variables that are needed to calculate the Area, perimeter, of those shapes
     */

    // instance variables:
    public double area;
    public double perimeter;


    //instance methods:
    public void CalculateArea(){
        System.out.println("Area of the shape is: "+0);
    }

    public void CalculatePerimeter(){
        System.out.println("Perimeter of the shape is: "+0);
    }
}
