package Day46_Final_Abstract;

public class ShapeObjects {

    public static void main(String[] args) {
        Circle obj1 = new Circle(3.5);
        // in order to get the area, call Area()
        obj1.Area();

        Square obj2 = new Square(5);
        obj2.Area();

        Rectangle obj3 = new Rectangle(3,5.1);
        obj3.Area();

        Triangle obj4 = new Triangle(4,5.5);
        obj4.Area();

    }


}
