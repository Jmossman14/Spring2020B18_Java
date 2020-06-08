package Day48.WarmUp;
/*
Warmup tasks:
	1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
	2. create the following subclasses of phone:
						1. iPhone
						2. Samsung
			create constructors in each sub class that can initialize the instance variables
 */
public abstract class Phone {

    //attributes:
    static String brand; // this is static since there is only 1 copy of each phone type: samsung or iphone
    public String model;
    public double price;
    public String size;


    //abstract methods:
    abstract public void calling(long phoneNum);
    abstract public void texting(long phoneNum);

    //instance method:
    public String toString(){
        return "Brand: "+brand+"\nModel: "+model+"\nSize: "+size+"\nPrice $"+price;
    }

}
