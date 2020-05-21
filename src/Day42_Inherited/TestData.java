package Day42_Inherited;
// extends Data: will inherit all of Data classes variables and methods
public class TestData extends Data {
    /*
        //create a public data: for everyone and anyone can accesss anytime, anywhere
    public static String publicData = "public";

    //create a protected data: visible in same package and visible in sub class outside package
    protected static String protectedData = "Protected";

    //create a default data:visible in same package
    static String defaultData = "default";

    //create a private data: on;ly visible in same class
    private String privateData = "private";
     */
    /*
    What are the data that are/or can be inherited?
    public
    default
    protected

    - they are inherited as they are built; static or instances
            - static can be called through the class name
     */

    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
       // System.out.println(TestData.privateData); < -  will not compile since this is a private data type
        // private can never be inherited





    }



}
