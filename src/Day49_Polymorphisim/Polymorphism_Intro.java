package Day49_Polymorphisim;



class Animal{ // can Animal inherit anything from Dog? No : PARENT CLASS

}
interface Animal2{ // interface class

}

class Dog extends Animal{ // this class inherits everything in Animal : CHILD CLASS

}
class Cat extends Animal{ // this class inherits everything in Animal : CHILD CLASS

}


public class Polymorphism_Intro {
    public static void main(String[] args) { // SUB class can never be the reference type of SUPER class
//reference side       // Object side
      //  Animal obj = new Animal();
        Animal obj2 = new Dog(); // POLYMORPHISM
        Animal obj3 = new Cat();// POLYMORPHISM

     // Dog obj4 = new Cat(); <---- Does not have an IS A relationship so this cannot use Polymorphism
        Dog obj4 = new Dog();
        Cat obj5 = new Cat();

        // only objects with the same Parent class can be placed
        Animal[] animalShow = { obj4 , obj5};


        // if a class is Abstract can we still create a POLYMORPHISM object? NO because no object can be created from an abstract class
        // BUT an abstract class can be on the REFERENCE side
    }
}
