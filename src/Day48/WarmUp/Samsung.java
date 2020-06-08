package Day48.WarmUp;

public class Samsung extends Phone{

    //feature of the Samsung only
    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    //constructor for this class
    public Samsung(String model, String size,double price){
        brand = "Samsung"; // no need to use this. because this will not change
        this.model = model;
        this.price = price;
        this.size = size;
    }

    //abstract methods from super class (phone)
    @Override
    public void calling(long phoneNum) {
        System.out.println("Samsung is calling "+phoneNum);
    }

    @Override
    public void texting(long phoneNum) {
        System.out.println("Samsung is texting with "+phoneNum);
    }
}
