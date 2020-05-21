package Day43_MethodOverriding;

public class ClassNotes {/*
https://github.com/CybertekSchool/Spring2020B18_Java/tree/master/src/day43_MethodOverriding

method overloading:
        same method name, DIFFERENT parameter
        Return type can be the same or differnt
        any method can be overloaded
        access modifier can be different

method Overriding:
        same method name, SAME parameter, SAME Return type  (MUST)
        MUST be used in the sub class
        ONLY used for the instance methods, (NOT static or constructor)
        access modifier must be the SAME OR MORE VISIBLE
            if public -> public
            if protected -> protected or public
            if default -> default, protected or public
            CANNOT BE PRIVATE

            public > protected > default > private

@ override = will identify if the method is being overridden or not

Why do we need overriding?
    - To change the functionalities from a SUPER CLASS method, to make it function in a SUB CLASS
    - to implement different functions of the method from a SUPER CLASS in a SUB CLASS

CANNOT override static or a constructor

Advantages:
        Reusable
        flexible
        unique to each sub class

TASK:
    Car: SUPER CLASS
        Start: Insert the key
               Twist ignition key to start

  Tesla: SUB CLASS
        Start: push button to start

  Honda: SUB CLASS
        Start: Insert the key
              Twist ignition key to start

  Jeep: SUB CLASS
    Start: Call mechanic
            oil change
            jump start


























*/
}
