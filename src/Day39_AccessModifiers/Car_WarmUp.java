package Day39_AccessModifiers;
/*
	1. create a class called Car:
				instance variable:
						brand, model, year, price


			step2: add a constructor that can initialize brand of car

				add a constructor that can initialize brand and model of the car
							(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method

 */
public class Car_WarmUp {

    //create instance variables:
    String brand;
    String model;
    int year;
    double price;

    // create 1st constructor to initialize the brand by filling in the parameter & using this. method:
    // use this() to initialize whatever is in the parameter from another constructor
    public Car_WarmUp(String brand){
        this.brand = brand;
    }

    // create 2nd constructor to initialize the model and 1st constructor by filling in the parameter & using this. & this() method:
    // use this() to initialize whatever is in the parameter from another constructor
    public Car_WarmUp(String brand,String model){
        this(brand); // initializes Brand
        this.model = model;
    }

    // create 3rd constructor to initialize the year and 2nd constructor by filling in the parameter & using this. & this() method:
    // use this() to initialize whatever is in the parameter from another constructor
    public Car_WarmUp(String brand, String model, int year){
        this(brand,model);// initializes Brand & model
        this.year = year;
    }

    // create 4th constructor to initialize the price and 3rd constructor by filling in the parameter & using this. & this() method:
   // use this() to initialize whatever is in the parameter from another constructor
    public Car_WarmUp(String brand, String model, int year,double price) {
        this(brand, model, year);// initializes Brand & model & year
        this.price = price;
    }
// create toString Method:
    public String toString(){
        return "Brand: "+brand+", model: "+model+", year: "+year+", $"+price;
    }

}
