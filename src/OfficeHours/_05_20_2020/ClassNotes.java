package OfficeHours._05_20_2020;

public class ClassNotes {

/*
* Inheritance: creates relationships between child and parent classes
* a class can be extended by multiple classes
* a class can ONLY extend one class
* super class can NOT inherit anything from sub class
* class A { int a;} ==> has int a
* class B extends A{ int b;} ==> has int a, b
* class C extends B { int c;} ==> has int a, b, c ==> the richest
* access modifiers:
    	private < default < protected < public
* Access modifers:
     public: accessible at everywhere, visible to the world
     protected: visible in same package, visible in sub class outisde packagfe
     default: only visible in same package
     private: only visible within the same class
* visibility:
     public > protected > default > private
Inheritance: sub class & super class
        sub class: can inherit visible variables and visible methods from super class
                private: can never be inherited in sub class
                defult: can be inherited as long as sub class is in the same package
                public & protected: can always be inherited to any sub class
                in same package: public, protected, default can be inherited
                different package: public & protected can be inherited
        super cass: cannot inherit anything from sub class
        one class can only extend one class
        one class can be extended by multiple classes
        constructor is not inherited
this: refers to the object instances of the current class
    this(): used for calling the constructors from current clas
    this.: used for calling instance variable and instance methods
super: refers to the object instance of the super class
    super(): used for calling the constructors from super class
    super.: used for calling the instance variables and isntance methods of super class
constructor calls:
        1. at least one parent class' constructor MUST be called in sub class
        2. if the constructor in parent class is default, it's called automatically in child class
        3.if the parent class' constructor is not default, MUST be called manually in sub class by using super keyword
* sub class: inherits from super class
					only the VISIBLE variables & methods can be inherited
* private: NEVER
* default: can be inherited to sub classes that are in same package
* protected & public : can ALWAYS be inherited to ANY sub class
* super class: cannot inherit anything from sub class
			a class can be extedned by multiple classes
			a class can ONLY extend one class
* IN OTHER WORDS: ONE PARENT (MOM OR DAD) FOR MULTIPLE CHILDREN
                ONE CHILD CAN ONLY HAE ONE PARENT ( ONE MOM OR ONE DAD)
*/
/*
task:	custom class: pet
		variables:	name, age, color, size, breed, isPet, numberOfeyes
		methods: 	eat, sleep, drink, toString + setInfo()
 */


}