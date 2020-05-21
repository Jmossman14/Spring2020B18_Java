package Day42_Inherited;

class A {
    int a = 100;

    //constructor:
    public A(double b) {

    }
}


public class SuperKeyword extends A{
    int a = 200;

    // whenever calling a constructor, must create a constructor in the current class
    public SuperKeyword(){
        super(10.5);// calls the constructor from class A
        System.out.println(super.a); // calls the instanc3 variable from class A
    }

    public static void main(String[] args) {
        // SuperKeyword obj = new SuperKeyword(); ->100 100
        A obj = new A(5.5); // outputs 100
    }
}

