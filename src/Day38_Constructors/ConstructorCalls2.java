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
public class ConstructorCalls2 {

    //create 1st no parameter constructor
    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }

    //create 2nd int constructor
    public ConstructorCalls2(int a){
        this();// calling the 1st constructor and prints -> "Default Constructor"
        System.out.println("Constructor with int argument");
    }

    //create 3rd String constructor
    public ConstructorCalls2(String str){
        this(10); // calling the 2nd constructor and prints -> " Constructor with int argument"
        System.out.println("Constructor with String argument");
    }

//=====================================================
    //main method:
    public static void main(String[] args) {
        // create object for constructor
        ConstructorCalls2 obj = new ConstructorCalls2("Hello");

    }
    //create an instance method
    public void method1(){

    }

    //create an instance block:
    {

    }
}
