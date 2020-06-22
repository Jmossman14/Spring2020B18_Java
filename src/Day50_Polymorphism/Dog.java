package Day50_Polymorphism;

import Day50_Polymorphism.Animal;

public final class Dog extends Animal {// final, makes everything below final and not able to change or reuse

    // dog variable:
    static String dogName;


    //dog method bark:
    public void bark() {
        System.out.println(dogName + "; the dog, is barking!");

    }

    //initialize variables from Animal class in a constructor
    public Dog(int age, String gender, String dogName) {
        this.age = age;
        this.gender = gender;
        this.dogName = dogName;
    }


    // Override methods from Animal class:
    @Override
    public void Eat() {
        System.out.println(dogName + "; the dog, is eating!");
    }

    @Override
    public void Sleep() {
        System.out.println(dogName + "; the dog, is sleeping!");
    }

    public static void methodA(int a) { // inherited the methodA w/out any arg & now has this methodA w/ arg
        System.out.println("Dog Class A");
    }

}