package Day43_MethodOverriding;

public class Jeep extends Car {//sub class
    // inherits: start()

    //Override method to change the functions from Car class
    @Override
    public void start(){
        System.out.println("Call mechanic \noil change \njump start");

    }
}
