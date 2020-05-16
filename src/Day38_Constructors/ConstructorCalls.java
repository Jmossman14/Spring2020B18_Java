package Day38_Constructors;
/*
    rules:
        1: Only constructor can call another constructor
        2: You cannot call another constructor by its name, you have to use THIS(); keyword!
                            - specific parameters go into () to call a specific constructor
        3: Constructor call needs to be the first thing you place into the method
           public Constructor(){
                        1st.  ->     this();
                       2nd.   ->     System.out.println("Hello");    }

        4: One constructor can only call 1 constructor
        5: Constructor cannot call itself or call another constructor that it is contained in

 */
public class ConstructorCalls {
    //default constructor method:
    // constructor accepts all methods, BUT other methods cannot accept constructor method unless you call it MANUALLY
    public ConstructorCalls() {
        method1();
        method2();
    }

    // method overloading begins

    public ConstructorCalls(int a) { //You cannot call another constructor by its name, you have to use THIS() keyword!
        // ConstructorCalls();
        this(); // automatically calls the constructor without any parameters, if you add parameters it will call that specific constructor
    }

    //static method:
    // static method can be called in method2 BUT method2 cannot be called directly into method1
    //static only accepts static
    public static void method1() {
        // method2();method2 cannot be called directly into method1 if method2 is a instance method

    }

    //instance method:
    public void method2() {

    }

}
