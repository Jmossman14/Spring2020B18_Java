package Day37_Construct;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Corolla", 2020, 32000);
        // ^^Constructor = String brand, String model, int year, double price
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1); //

    }




}
