package Day49_Polymorphisim.WarmUp;

public final class iPhone extends Phone implements AppleApps { // added FINAL so that no other classes can copy this class

    //static block
    static{ // only 1 copy shared by the entire object
       brand = "Apple";
    }

    //constructor
    public iPhone(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }

    // inherited abstract methods / variables
    @Override
    public void Download() {
        System.out.println("iPhone is downloading apps from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling "+phoneNumber);
    }

    public void faceTimeing(long phoneNumber){
        System.out.println("iPhone is Facetiming with "+phoneNumber);
    }

}
