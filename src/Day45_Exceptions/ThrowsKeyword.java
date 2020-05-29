package Day45_Exceptions;

public class ThrowsKeyword {
// try & catch method
    public static void sleep() {

        try {
            Thread.sleep(3000);

        } catch (Exception e) {

        }

    }

    // THROWS method:
    public static void sleep2() throws InterruptedException {
        Thread.sleep(3000);
        Thread.sleep(3000);

    }


    public static void main(String[] args) throws Exception {
        System.out.println("Cybertek");
        sleep();
        sleep2(); // doesnt compile UNLESS you add another Throws Exception because it does change or fix the exception outside of the original method
        sleep3();// doesnt compile UNLESS you add another Throws Exception because it does change or fix the exception outside of the original method
        System.out.println("Java");
    }

    public static void sleep3()throws Exception{
        Thread.sleep(3000);
    }

    public static void method1()throws Exception{
     String[] arr = {"A"};
     main(arr);

    }


    public static void method2()throws Exception{
       method1(); // only compiles if you add another Throws Exception on this method or use a try & catch block

    }

}
