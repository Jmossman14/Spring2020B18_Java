package Day46_Final_Abstract;

public class Final_Practice {

    final int a = 10;
    final static int b = 20;

    { // block = can print a final variable
        System.out.println(a);

        // block cannot allow changes to be made to a final variable:
        // a = 20; -> cannot reassign
    }

    // static block:
    static {// static block = can print a final static variable

        System.out.println(b);

        // block cannot allow changes to be made to a final variable:
        // a = 20; -> cannot reassign

    }


    public final void method1() {

    }

    public final static void method2() {

    }


    final class test extends Final_Practice {
    /*
    @Override
    protected void method1(){ }
     */

    }


    final class test2 extends Final_Practice {

    }
}
