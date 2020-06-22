package Day50_Polymorphism;

public class Inheritance {
    public int publicInt =100;
    protected int protectedInt = 200;
    int defaultInt = 300;
    private int privateInt = 400; // shouldnt consider making anything private if you want it to be inherited





}


class Data extends Inheritance { // inherits variables from above class
    public static void main(String[] args) {


        Data obj = new Data();
        System.out.println( obj.publicInt );
        // System.out.println( obj.privateInt ); // private is not inherited
        System.out.println( obj.protectedInt );
        System.out.println( obj.defaultInt );

    }

}
