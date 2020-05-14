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
public class ConstructorCalls3 {

    // 1st constructor, default
    public ConstructorCalls3(){
        this(9); // calls 2nd constructor -> prints "Int Argument"
        System.out.println("Default");// prints "Default"
        //this(); -> rule #3 = cannot be placed here because it needs to be the 1st thing placed in the method
    }

    // 2nd constructor, int
    public ConstructorCalls3(int a){
        //this(); -> rule #6 = cannot call 1st constructor because it contains 2nd constructor in its body
        System.out.println("Int argument");

    }

    //3rd Constructor, string
    public ConstructorCalls3(String str){
       // this("Hello"); -> rule #5 = cannot call the same constructor

    }

    /*Why do you need to create an object?
     - Because the execution of the constructor depends on the creation of an object */

    public static void main(String[] args) {
        ConstructorCalls3 obj1 = new ConstructorCalls3(0);
    }


    public void method1(){
        //this(); - cannot use in instance method
    }




}
