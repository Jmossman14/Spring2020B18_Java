package Day39_AccessModifiers;

public class CarObjects {
    public static void main(String[] args) {
        //create object to test functions of Car_WarmUp class:
        Car_WarmUp car1 = new Car_WarmUp("Toyota");
        System.out.println(car1); //Brand: Toyota, model: null, year: 0, $0.0

        Car_WarmUp car2 = new Car_WarmUp("Toyota","Corolla");
        System.out.println(car2);// Brand: Toyota, model: Corolla, year: 0, $0.0

        Car_WarmUp car3 = new Car_WarmUp("Toyota","Corolla",2020);
        System.out.println(car3);// Brand: Toyota, model: Corolla, year: 2020, $0.0

        Car_WarmUp car4 = new Car_WarmUp("Toyota","Corolla",2020,34000);
        System.out.println(car4);// Brand: Toyota, model: Corolla, year: 2020, $34000.0


    }
}
