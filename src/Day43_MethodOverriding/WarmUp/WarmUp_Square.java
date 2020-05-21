package Day43_MethodOverriding.WarmUp;



public class WarmUp_Square extends WarmUp_Shape {

    //create instance variables for this class

    public double side;

    public WarmUp_Square(double side){
        this.side = side;
    }
    // OVERRIDE Methods from Shape class (super class)
    @Override // if compiles, then it has been overriden
    public void CalculateArea(){
        area = side * side;
        System.out.println("Area of the square is: "+area);
    }
    @Override
    public void CalculatePerimeter(){
        perimeter = side * 4;
        System.out.println("Perimeter of the square is: "+perimeter);
    }





}
