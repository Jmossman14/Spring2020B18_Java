package Day49_Polymorphisim.WarmUp;

public class Nokia extends Phone implements AndroidApps {

    //static block
    static{ // only 1 copy shared by the entire object
        brand = "Nokia";
    }

    //constructor
    public Nokia(String model, double price, String size){
        this.model = model;
        this.price = price;
        this.size = size;
    }

    // inherited abstract methods / variables
    @Override
    public void Download() {
        System.out.println("Nokia is downloading apps from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Nokia is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Nokia is calling "+phoneNumber);
    }

    public void Freezing(long phoneNumber){
        System.out.println("Nokia is Freezing while on the phoen with "+phoneNumber);
    }

}


