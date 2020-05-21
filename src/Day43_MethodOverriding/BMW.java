package Day43_MethodOverriding;

public class BMW extends Car { // sub class
    // inherits: start()

    //Override method to change the functions from Car class
    @Override
    public void start(){
        System.out.println("Call some friends \nTell them to push \nRemove clutch peddle");


    }

}
