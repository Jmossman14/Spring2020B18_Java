package Day42_Inherited;

public class Data {
    //create a public data: for everyone and anyone can accesss anytime, anywhere
    public static String publicData = "public";

    //create a protected data: visible in same package and visible in sub class outside package
    protected static String protectedData = "Protected";

    //create a default data:visible in same package
    static String defaultData = "default";

    //create a private data: on;ly visible in same class
    private String privateData = "private";



}

class test extends Data{
    public static void main(String[] args) {
        //public & protected can ALWAYS be inherited

        System.out.println(test.protectedData);
        System.out.println(test.publicData);
        System.out.println(test.defaultData); // default only in the same package,
       // System.out.println(test.privateData); < - private can NEVER be inherited
    }
}
