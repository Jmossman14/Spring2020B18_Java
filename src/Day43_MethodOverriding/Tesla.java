package Day43_MethodOverriding;

public class Tesla extends Car {//sub class
    // inherits: start()

    //Override method to change the functions from Car class
    @Override
    public void start(){
        System.out.println("Push button to start");


    }
}
