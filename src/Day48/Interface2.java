package Day48;

public interface Interface2 {

    int a = 100;

    public static void main(String[] args) {
        System.out.println(a); // default by static

      //  a = 200; => this is a final by default, cannot be reassigned

     // for variables you can only use : FINAL & STATIC

        System.out.println( Interface2.a);
        Interface2.method4();


    }

    //static method
    public static void method4(){

    }

    //abstract method
    public abstract void method();

    // default method given to Interface (can be inherited into sub class )
    default void method6(){
        System.out.println("Default method");
    }
}
