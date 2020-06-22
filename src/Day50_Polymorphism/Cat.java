package Day50_Polymorphism;

import Day50_Polymorphism.Animal;

public final class Cat extends Animal { // final, makes everything below final and not able to change or reuse

    // Cat variable:
    static String catName;

    //cat method:
    public void Scratch(){
        System.out.println(catName+"; the cat, is scratching! ");
    }


    //initialize variables from Animal class in a constructor
    public Cat(int age, String gender, String catName){
        this.age = age;
        this.gender = gender;
        this.catName = catName;
    }

    // override methods:
    @Override
    public void Eat(){
        System.out.println(catName+"; the cat is eating!");
    }

    @Override
    public void Sleep(){
        System.out.println(catName+"; the cat is sleeping!");
    }



}
