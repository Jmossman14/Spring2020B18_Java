package Day38_Constructors;

public class ClassNotes {
    /*

    Constructor:
            Access_Modifier       MethodName( Parameter  ) {
                            assign parameter -> instance variables; }

            public              className( Parameter ) {
                    this.parameter = instance variable;
                    this.parameter = instance variable; }


Creating object:

*WE CAN HAVE MULTIPLE CONSTRUCTOS IN A CLASS AS LONG AS WE HAVE DIFFERENT PARAMETERS
Overloading: same method name, different parameters


        public void sum(int a, int b){
                  a + b;      }

       public void sum(int a, int b, int c){
                  a + b + c;      }

                    advantages:
        - readable
        - easy to maintain
        - reusable


*The default constructor will get executed depending on the OBJECT and the PARAMETER we input

this: refers to object instances
    this. : we call instances of the object
    this() : used for calling constructors within the SAME/CURRENT class

Constructor calls: rules when calling a constructor
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


Static block vs. instance block  vs. constructor



OOP: Object Oriented Programming





























     */
}
