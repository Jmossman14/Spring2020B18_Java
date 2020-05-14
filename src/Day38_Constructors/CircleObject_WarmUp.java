package Day38_Constructors;

import java.text.DecimalFormat;

/*
test the functions of Circle_WarmUp
 */
public class CircleObject_WarmUp {
    public static void main(String[] args) {
        // a given radius of a circle is below:
        double r = 5.5;

        //Decimal Formatter will print out 0.00
        DecimalFormat df=new DecimalFormat("0.00");
        //to use the class you MUST initialize an object:
        Circle_WarmUp circle1 = new Circle_WarmUp(r);



        System.out.println("Diameter is "+circle1.diameter);
        System.out.println("Area: "+df.format(circle1.area()));
        System.out.println("Perimeter of "+circle1.perimeter());

    }
}
