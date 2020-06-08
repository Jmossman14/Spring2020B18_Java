package Day48.WarmUp;

public class iPhone extends Phone {

    //feature of the iPhone only
    public void FaceTime(long phoneNum){
        System.out.println("Iphone is facetiming with "+phoneNum);
    }


    //constructor for this class
    public iPhone(String model, String size,double price){
        brand = "iPhone"; // no need to use this. because this will not change
        this.model = model;
        this.price = price;
        this.size = size;
    }


    //abstract methods from super class (phone)
    @Override
    public void calling(long phoneNum) {
        System.out.println("Iphone is calling "+phoneNum);
    }

    @Override
    public void texting(long phoneNum) {
        System.out.println("Iphone is texting with "+phoneNum);
    }
}
