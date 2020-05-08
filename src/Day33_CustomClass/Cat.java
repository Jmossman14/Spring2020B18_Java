package Day33_CustomClass;
/*
cat class:
      data/attributes:  instance variables
        breed, color, age
      actions: instance methods
        sleep(), eat(), drink()
 */

public class Cat {
// data attributes of cat
    String breed;
    String color;
    int age;
    String name;



    public void sleep(){

        System.out.println(name+" is sleeping");
    }

    public void eat(String catFood){ // parameter will allow different String inputs of cat food

        System.out.println(name + " is eating "+catFood);
    }

    public void drink(String drink){// parameter will allow different String inputs of cats drinks

        System.out.println(name +" is drinking "+drink);
    }

    public void setCatInfo(String catBreed, String catColor, int catAge, String catName){
        breed = catBreed; // assigns parameter to the variable Object
        color = catColor;
        age = catAge;
        name = catName;
    }


    public String toString(){
        return name+", breed is "+breed+", color is "+color+", "+age+" years old";
    }



}