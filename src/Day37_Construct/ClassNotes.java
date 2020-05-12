package Day37_Construct;

public class ClassNotes {
    /*
    Regular Imports:
        Syntax:
            import Package.Name.ClassName;
                - imports 1 class from package
            import PackageName.*;
                - imports all classes needed

    Static Import: - used to import static varibales or methods
        Syntax:
            import static PackageName.className.name;
                - only imports 1 static at a time, whatever static( name ) that you call
            import static PackageName.className.*;
                - imports all static variables and methods from the class

Two initializer Blocks in Java:
        Static initializer block:
                static{
                        statement       } ;
                        - will be executed as soon as the class is loaded (when compiler runs a code)
                        - designed for initializing static variables
                        - compiler runs static first ALWAYS no matter where it is placed and 1 time

        instance initializer block:
                {
                        statement   };
                        - belongs to the object, every object has its own copy (can hold many copies)
                      - designed for initializing static variables
                       - can be placed anywhere on the outside of main method.

   Regular methods:                         Mandatory      Mandatory
            Access-modifier    specifier    return-type   methodName( parameter [ if needed ]){
                                   statement; }

            Access-modifier = public, protected, default, private
            Specifiers = static, abstract, final
            return type = void, any primitive and non primitives (int, string, boolean)
            MethodName = anyname (that makes sense to what method will do)
            parameter = any data type

  Constructor: very special method
        * Used when we create an OBJECT of a class
        * Every classes MUST have a constructor
        * if not created manually the compiler will create for us
       *Execution always depends on the object and how many objects are created


         Access-modifier     methodName( parameter [ if needed ]){
                                   statement; }

         class Test {

                               statement;    }
        methodName = must be the same as className

        -how do you create an object?
        className   object  = keywordNew    Constructor();
          Test      obj     =    new        Test();












    ===============================================================================
  Quiz:
    What can be stored in static?
        - Methods, Variables, block, class

    Static only accepts static, unless it is called through an object (obj.)

    Instance variable can hold multiple copies(different data)

    Static variables can only hold 1 copy(1 data type)

    Static methods can not access instance methods and instance variables directly

    Instance methods can access instance methods and instance variables directly

    In static methods we can not use the “this” keyword

    Instance methods can also access static methods and static variables directly

     */
}
