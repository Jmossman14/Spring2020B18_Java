package Day46_Final_Abstract;

public final class Circle extends Shape {
    // must add abstract or final then extend super class

    // create individual variables for each class, in its own class:
    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;

    }

    @Override
    void Area(){ // access modifier must be the same or more visible
    double area = radius * radius * PI;
        System.out.println("Area of Circle: "+area);

    }



     /*
    Since this is the sub class; you must add a body to the abstract method
    and remove the word 'abstract'

     */

}
