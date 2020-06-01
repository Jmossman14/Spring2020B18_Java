package Day46_Final_Abstract;

public final class Square extends Shape{

    public double side;

        // create a constructor
    public Square(double side){
        this.side = side;

    }


    void Area(){
        double area = side * side;
        System.out.println("Area of Square: "+area);
    }








}
