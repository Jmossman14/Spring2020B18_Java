package Day48.WarmUp;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("X", "10 plus", 1000);
        iPhone iphone2 = new iPhone("8 Plus", "8 in.", 850);

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.FaceTime(3521151);
        iphone1.calling(911);
        iphone1.texting(411);

        // Samsung Class:
        Samsung Samsung1 = new Samsung("HTC", "10 in.", 850);
        Samsung Samsung2 = new Samsung("Galaxy", "8 in.", 750);

        System.out.println(Samsung1);
        System.out.println(Samsung2);

        Samsung1.freezing();
        Samsung1.calling(911);
        Samsung1.texting(411);

    }
}
