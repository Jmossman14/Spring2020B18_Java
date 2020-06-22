package Day49_Polymorphisim;

public class ClassNotes {
    /*
    Polymorphism (Many forms): Objects behave in different forms

                - Assigning the Super class to the child class object
                - MUST have an "is a" relationship
                - SUB class can never be the reference type of SUPER class
                        Parent: Animal
                        Child: Cat, Dog, Horse
                                Can use Polymorphism
                            cat IS A animal
                            Dog IS A animal
                            Horse IS A animal
                                            Cannot use Polymorphism
                                        Cat is NOT a dog
                                        Dog is Not a Horse
                                        Horse is NOT a Cat

        Super class: Animal
        Child Class: Dog

         Ex.   regular object assigning =
                     Dog dog1 = new Dog();
               Polymorphism object assigning =
                     Animal dog2 = new Dog();
        Ex.
            Super class: WebDriver
            Child Class: ChromeDriver
                     WebDriver driver  = new ChromeDriver();

        - cannot be created from an Abstract class





















     */
}
