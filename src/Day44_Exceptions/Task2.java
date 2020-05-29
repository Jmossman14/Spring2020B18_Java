package Day44_Exceptions;
/*
1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
parameters: double seconds
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println("Hello");
        wait(2);
        System.out.println("Cybertek");
        wait(3);
        System.out.println("Java");
        wait(4);
        System.out.println("Completed");
        wait(10);
    }

    // create a method with a parameter to allow changes to the wait time between each statement
    // use try & catch to use the Thread.sleep
    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // only works in the try block
        } catch (Exception e) { // exception is the parent exception
           // no need to place any statement in the body since the try block will work'''''''''''''''''''''''''

        }

    }
}
