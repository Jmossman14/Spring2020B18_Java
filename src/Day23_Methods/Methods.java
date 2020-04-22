package Day23_Methods;
/*
Methods: Grouping series of statements to perform a task
            Example:
                step 1: reverse a string
                step 2:statement
                step 3:statement
                step 4: reverse a string
                step 5:statement
*Methods will combine all steps

benefits: re-usable!
                     Access-modifier     specifier    return-Type    methodName (){
                                                      statements; }
Declaration of Methods:
    Access Modifiers:
            public, protected, default, private
    Specific:
            static, final, abstract, synchronized
     return type:
            void && any Data Type (int, short, byte, String, Char.... etc.)

**METHODS CANNOT BE DECLARED IN ANOTHER METHOD, MUST BE PLACED OUTSIDE BRACKETS{}, but INSIDE THE CLASS

 */
public class Methods {


    public           static        void         main(String[] args) {
  //Access-modifier specifier    return-Type    methodName
            printHello5Times(); // declare the below in a loop, then paste methodName in main method.
                                // this allows it to be re-uasble instead of printing SOUT 5 times

    }

    public static void printHello5Times (){ // use Loop or SOUT to print 5 times .

        for(int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }

    }
}
