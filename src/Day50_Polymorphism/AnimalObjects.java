package Day50_Polymorphism;

public class AnimalObjects {

    public static void main(String[] args) {
        // regular objects:
        Cat cat1 = new Cat(4,"female","oui");
        cat1.Eat();
        cat1.Sleep();
        cat1.Scratch();

        Dog dog1 = new Dog(6,"Male","Lionel"); // able to call all objects from Dog and Animal class since it was inherited
        System.out.println(dog1.dogName);
        dog1.bark();

        System.out.println("==============================");
        //POLYMORPHISM objects:  --> Parent class referenced to child class
        //parent            // child
        Animal cat2 = new Cat(5, "Female","Kimmie");

        Animal dog2 = new Dog(9,"Male","Kito");
       // System.out.println(dog2.dogName ); // cannot call methods/variables that were created in the DOG class since this reference type is ANIMAL
        // dog2.bark();                // only variables/methods from the Animal class will work
        dog2.Eat(); // this was overridden in the dog class, so that overriden method will be used/executed
        dog2.methodA();

        System.out.println("=========================");

        // instanceOf :

        Animal animal1 = new Cat(3,"Male","Hen");
                // check to see if the animal1 is referenced to the DOG class
            boolean isDog = animal1 instanceof Dog; // expected to be FALSE, since this variable is referencing the CAT object
            System.out.println(isDog);

            boolean isCat = animal1 instanceof Cat; // expected to be TRUE, since this variabler is referencing the CAT OBJECT
            System.out.println(isCat);

            Dog dog3 = new Dog(2,"Male","Jen");
            // Does this class have any relationship with the Cat class? NO
        // in order to use instanceOf, there MUST be a relationship between classes (Super to Child) (no child to child)
            //boolean r1 = dog3 instanceof Cat; // NO "IS A" relationship

        boolean r2 = animal1 instanceof Animal;    // above we listed Animal as the reference type, this is why it is TRUE
                                                // animal IS A Animal
        System.out.println(r2);

        Dog animal2 = new Dog(2, "Female","QQ");
    }
}
