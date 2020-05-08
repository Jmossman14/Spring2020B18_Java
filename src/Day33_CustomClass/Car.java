package Day33_CustomClass;

public class Car {
        // instance variables
    String Brand;
    String model;
    int year;
    String color;

    // object methods
    public void start(){
        System.out.println(Brand+" is started");
    } //

    public void drive(){
        System.out.println("Driving "+Brand+" "+model);
    }

    public void getCarInfo(){
        System.out.println(year+" "+Brand+" " +model+" "+color);
    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        model = carModel;
        year =carYear;
        color = carColor;
    }


    public String toString(){ // compiler calls it AUTOMATIC
        String result = Brand+" "+year+" " +model+" "+color;
        return result;
    }





    public static void main(String[] args) {
        int a = 100;  // local variable
    }


}