package Day38_Constructors;
/*
Task02:
   step1: Create a class called Circle
            instance variables:
                    radius, pi, diameter

            step2: add a constructor that can initialize the radius of the circle
            instance methods:
                    -area(): can return the area of the circle as double
                   - perimeter(): cna return the perimeter of the circle as double
                    -toString(): returns the info of the circle

            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r

 */
public class Circle_WarmUp {
    // PI is static because the value never changes
    static double PI = 3.14;

    // create instance variables:
    double radius;
    double diameter;

    //create a constructor
    public Circle_WarmUp(double radius){
        this.radius=radius;
        diameter= radius * 2; // we do not need to use THIS. for diameter since this will be the formula
    }

    // can we use STATIC METHOD to create a method for the area? NO
    //create an instance METHOD to calculate the area:
    public double area(){
        return PI*radius*radius;
    }

    // can we use STATIC METHOD to create a method for the area? NO
    //create an instance METHOD to calculate the perimeter:
    public double perimeter(){
        return diameter * PI;
    }

    // create a toString Method to print out objects:
    public String toString(){
        return "Radius: "+radius+", Diameter: "+diameter+", Area: "+area()+", Perimeter: "+perimeter();
    }

}
