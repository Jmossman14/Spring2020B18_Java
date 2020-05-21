package Day43_MethodOverriding;

public class Car { // Super class
    void start(){ // this has a default Access Modifier, so when you override you can use any AM besides Private
        System.out.println("Insert the key");
        System.out.println("Twist ignition to start ");

    }
}
