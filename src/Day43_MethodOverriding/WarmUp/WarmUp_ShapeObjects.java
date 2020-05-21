package Day43_MethodOverriding.WarmUp;

public class WarmUp_ShapeObjects {
    public static void main(String[] args) {

        WarmUp_Circle circle1 = new WarmUp_Circle(3);

        System.out.println(circle1);

        circle1.CalculateArea();// no output
        circle1.CalculatePerimeter();// no output

        System.out.println("==================================");

        WarmUp_Rectangle rec1 = new WarmUp_Rectangle(3,2);

        System.out.println(rec1.length);
        System.out.println(rec1.width);

        rec1.CalculateArea(); // no output
        rec1.CalculatePerimeter();// no output

        System.out.println("==================================");
        WarmUp_Square square1 = new WarmUp_Square(3);

        System.out.println(square1);

        square1.CalculateArea(); // no output
        square1.CalculatePerimeter();// no output
    }
}
