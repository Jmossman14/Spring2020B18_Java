package Day48;

interface A{
void method1();
}
interface B{
 abstract void method2();

}
interface C{
     abstract void method3();

}
public class Abstraction2 implements A, B, C { // now implements A & B behaviors (if any)
    // if there are any abstract methods, they must be overridden



    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3(){

    }
}
