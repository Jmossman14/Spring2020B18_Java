package Day49_Polymorphisim;

interface A {
    void readBook(); // this is a public accessModifier since it is interface
    abstract void watchTv();
}

abstract class B implements A { // not mandatory to override the abstract methods since this is interface
    public void readBook() {
        System.out.println("RB");
    }

}
public class Test extends B {


    @Override
    public void watchTv() {

    }
}


