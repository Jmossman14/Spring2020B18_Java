package Day46_Final_Abstract;

public final class Triangle extends Shape {
    // must add abstract or final then extend super class

    // create individual variables for each class, in its own class:
    public double base;
    public double height;


    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;

    }

    @Override
    void Area() { // access modifier must be the same or more visible
        double area = height * base * .5;
        System.out.println("Area of Triangle: " + area);

    }
}