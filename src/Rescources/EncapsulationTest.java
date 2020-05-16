package Rescources;

//must import to utilize another package
import Day40_Encapsulation.Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {

        Encapsulation obj1 = new Encapsulation();
        //System.out.println(obj.SSN); --> not accessible

        System.out.println(obj1.getSSN()); // outputs 0, info becomes readible but there is not value yet
        obj1.setSSN(123456); // SETS the value "123456"
        //create another getter to print the 123456
        System.out.println(obj1.getSSN()); //

    }
}