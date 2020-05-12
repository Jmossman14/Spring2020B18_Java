package Day37_Construct;

public class ConstructorIntro {
    /* all classes MUST have a constructor

      Access-modifier     methodName( parameter [ if needed ]){
                                   statement; }


    - object MUST be created with existing constructor in order for it to compile

    */
        // methodName = must be the same as className
    public ConstructorIntro(int a){// this method must be executed in the code at some point

        System.out.println("Constructor with parameter of int");
    }
    public static void main(String[] args) {
        // create an object for this class, in order for constructor(ConstructorIntro) to be executed

        /*ConstructorIntro obj = new ConstructorIntro();
                                      ^^ this is the constructor, if not created manually the compiler will create for us
                               * object MUST be created with existing constructor in order for it to compile
              */
        // create an object for this class, in order for constructor(ConstructorIntro) to be executed

        ConstructorIntro obj2 = new ConstructorIntro(10);
                                                    // ^^ must place the matching parameter data type (integer since above is int a)

    }
}
