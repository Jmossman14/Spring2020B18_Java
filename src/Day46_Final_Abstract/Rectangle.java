package Day46_Final_Abstract;

public final class Rectangle extends Shape {
    // must add abstract or final then extend super class

    // create individual variables for each class, in its own class:
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

    }

    @Override
    void Area() { // access modifier must be the same or more visible
        double area = length * width ;
        System.out.println("Area of Rectangle: " + area);

    }
}