package Day43_MethodOverriding.WarmUp;

public class WarmUp_ShapeObjects {
    public static void main(String[] args) {

        WarmUp_Circle circle1 = new WarmUp_Circle(3);

        System.out.println(circle1.radius);
        System.out.println(circle1.PI);

        circle1.CalculateArea();// change functionalities, override & add to statement: area = radius * radius * PI;
        circle1.CalculatePerimeter();// change functionalities, override & add to statement:  perimeter = radius * 2 * PI;

        System.out.println("==================================");

        WarmUp_Rectangle rec1 = new WarmUp_Rectangle(3,2);

        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.CalculateArea(); // change functionalities, override & add to statement:   area = length * width;
        rec1.CalculatePerimeter();//change functionalities, override & add to statement:    perimeter = (width + length) * 2;

        System.out.println("==================================");
        WarmUp_Square square1 = new WarmUp_Square(3);

        System.out.println(square1.side);

        square1.CalculateArea(); // change functionalities, override & add to statement:    area = side * side;
        square1.CalculatePerimeter();// change functionalities, override & add to statement:    perimeter = side * 4;

    }
}
