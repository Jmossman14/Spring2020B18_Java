package Day44_Exceptions;

public class try_CatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("hello");

        //create a try & catch block to make the sleep method work
        try {

            Thread.sleep(2000); // stops the current execution for the time in milliseconds inputted in the ()
            // so Hello is printed and then World is printed 2 seconds later

            System.out.println("Try block"); // if the exception works, then this statement will be printed
        }catch(Exception e){


            System.out.println("Catch block"); // if the exception in the try block works, this will NOT print
                        // if it doesnt work, then this statement will print

        }

        System.out.println("world");



    }
}
