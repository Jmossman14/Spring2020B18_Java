package Day49_Polymorphisim.WarmUp;

public class PhoneObjects {

    public static void main(String[] args) {
        iPhone ph1 = new iPhone("iPhone X Plus", 1100.99, "10 in"); // brand will automatically be initialized here since its in the static block

        System.out.println(ph1); // will use the toString method to print the object
        ph1.texting(123456);
        ph1.calling(35215325);
        ph1.faceTimeing(214523);
        ph1.Download();

        Nokia ph2 = new Nokia("HTC plus", 799.50,"8 in"); // brand will automatically be initialized here since its in the static block

        System.out.println(ph2);
        ph2.texting(123456);
        ph2.calling(35215325);
        ph2.Freezing(214523);
        ph1.Download();
    }
}
