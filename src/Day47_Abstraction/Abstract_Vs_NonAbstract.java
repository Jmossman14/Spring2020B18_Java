package Day47_Abstraction;

//regular class:
class test1{
    //can you have the below in a non abstract (regular class): YES
   public test1(){}
   public void method1(){}
   public static void method2(){}
    int a = 100;
    static int b = 100;
    static{}
   //cannot: public abstract void method3();


}

//abstract class:
abstract class test2{
    //can you have the below in a non abstract (regular class): YES
    public test2(){} // why do we have a constructor in an abstract class? It is mandatory in every class, if its not manually declared, there will be a default constructor created
    public void method1(){}
    public static void method2(){}
    int a = 100;
    static int b = 100;
    static{}
    public abstract void method3();

    //cannot: create objects or use FINAL



}


public class Abstract_Vs_NonAbstract {
}
