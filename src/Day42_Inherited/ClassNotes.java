package Day42_Inherited;

public class ClassNotes {
    /*
Access Modifiers:
    public: for everyone and anyone can accesss anytime, anywhere

    default: visible in same package

    private: on5ly visible in same class & can NEVER be inherited

    PROTECTED: ALWAYS visible in same package and visible in sub class outside package

    Inheritance: super class(PARENT) & sub class ( CHILD)
        super class: cannot inherit anything from a sub class, since this class is the giver(of variables and methods to other classes)
                 -(super class) can be extended by multiple class

        sub class: can inherit variables and methods from the SUPER class
            private: never inherit in a sub class
            default: can be inherited as long as the sub class is in the same PACKAGE
            public & protected:
                -(sub class) can only extend ONE class

Public > protected > default > private

in same package: public, protected & default
diff package: public &  protected

this: refers to the objects instances of the current class
    this(): used for calling the constructors of the current class
        this. :used for calling instance variables and instance methods

super: refers to the objects instances of the SUPER CLASS (parent)
    super(): used for calling the constructors of the SUPER class
        super. : used for calling instance variables and instance methods from SUPER CLASS

constructor calls:
1. at least 1 of the constructors from the parent class MUST BE called in subclass
        - UNLESS it is a default [ () empty ] constructor
2. if the constructor in parent class is default its called auto
3. if the parent class constructor is not default MUST be called manually in sub class by using SUPER( parameter ); keyword






























     */
}