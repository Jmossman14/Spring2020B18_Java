package OfficeHours._05_13_2020;

public class Instances {
    // creating instance variables:
    // each instance variable has multiple copies based on how many objects are created
    String name;

    //creating Instance blocks:
    // belongs to the object that will be created, and will execute
    {
        name = "Zuura";
    }


    //creating instance methods : (DOES NOT HAVE STATIC MODIFIER)
    // you can use instance variables in an instance method
    public void printName(){
        // if you have a local variable that has the same as the instance variable, you will use the this.instanceVariablename
        System.out.println("Name is: "+name);
    }



}
