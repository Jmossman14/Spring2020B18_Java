package Day48;

//interface class
interface I1{ // 1 abstract method

void method1();

}

interface I2 extends I1{ // 2 abstract methods (1 from I1)
    void method2();

}
//abstract class
abstract class AC implements I2  { // 3 abstract methods (1 from I1 & 1 from I2)

   abstract void method3();

}/*

//regular class
public  class extends_implementation extends AC { // 3 abstract methods inherited from the above classes and needs to be overridden

    @Override
    public void method2() {

    }

}
    class testRun extends extends_implementation{

        @Override
        public void method2(){

    }
    @Override
        public void method3(){

    }

        @Override
        public void method1() {

        }
    }
*/