package OfficeHours._05_13_2020;

public class InstanceTest {
    public static void main(String[] args) {
/*
Each object has its OWN copy of the instance variable
MUST assign each object to the instance variable or else it will output NULL
 */

        //create an object to test the functions of Instances class:
        Instances obj1 = new Instances();
        obj1.name = "Judy"; // calls the String Name
        obj1.printName();


        Instances obj2 = new Instances();
        // since there are 2 objects, MUST assign obj2 to String name
        obj2.name = "Keora";
        obj2.printName();

        // ===========================================================


    }





}
