package Day46_Final_Abstract;

public class ClassNotes {
    /*
    Final: constant, cannot be changed

                can only be applied to:
                    1: variables: cannot be reassigned
                      If i have 2 private datas and one is declared as final, can i generate getter & setter to both ?
                            - you cannot reassign a FINAL, so you cannot use SETTER -> but you can use GETTER

                    2: methods: even if the method is FINAL, the implementation(statements/codes inside {} )
                            cannot be changed
                            - you CAN use method overloading; main method & static methods
                            - you cannot used method overriding nor can you apply Final to a constructor



                    3: class: immutable class, cannot be inherited


     Abstraction: Hiding the implementation details [ creating a method without the body ]
        concentrating on the essentials and important things, without worrying about the details
            - focused on what is important
            - allows the sub classes to use the method how they see fit
        Ex 1":
            Car: (super class)
                start(); [ Hides the implementation, creating a method without the body ]

            BMW:
                start (): push start button

          Toyota:
            start(): Insert Key

       Ex 2:

        Shape: (super class)
            Area(); [creates implementation without any value]


            Triangle:
                 Area(): base * height * 1/2

            Circle:
                Area(): radius * radius * PI

            Square:
                Area(): side * side

    Abstract Method:
                - a method without a body / implementation (statement)
                - a method thats meant to be overridden
                - CANNOT BE (FINAL, STATIC, PRIVATE)

            public abstract void method();

   2 ways of acheiving abstractions:
        1. abstract class
                - meant to be inherited ( cannot be FINAL  )
                        - cannot use any methods that are not visible
        2. using Interface





FINAL CANNOT BE ABSTRACT and vise versa




























     */
}
