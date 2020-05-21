package Day43_MethodOverriding;

class Test{ // super class
    public void method(){
        System.out.println("Onur");
    }






}

//=======================================================================================


public class MethodOverriding extends Test { // subclass
// method Overriding, takes the method from the super class and changes the statement
            // same method name, different functions(statement)
    @Override
    public void method(){
        System.out.println("Zarina");
    }



    // inherits Test instances and methods
    public static void main(String[] args) {
        Test obj1 = new Test(); // calls the method through the object of Test class
        obj1.method(); // outputs Onur

        MethodOverriding obj2 = new MethodOverriding();// calls the method through the object of MethodOverriding class
        obj2.method();// if you want to change what this outputs you have to use method Overriding



    }
}
