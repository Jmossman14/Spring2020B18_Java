package Day49_Polymorphisim.WarmUp;

//interface classes
 interface downloadable {
    boolean downloadable = true; // public static final = must be initialized
    void Download(); // this is abstract, so it is meant to be overridden

     }

 interface AndroidApps extends downloadable {
     String AppStoreName = "Android";// public static final = must be initialized

}

interface AppleApps extends downloadable{
     String AppStoreName = "Apple"; //public static final = must be initialized

}

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public String toString(){
        return "Brand: "+brand+"\nModel: "+model+"\nPrice: $"+price+"\nSize: "+size;
    }
}




