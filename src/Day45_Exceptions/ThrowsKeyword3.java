package Day45_Exceptions;

public class ThrowsKeyword3 {

    public static void method1() throws Exception{
        Thread.sleep(3000); // if the exception occurs before running this is a checked exception
    }

    public static void main(String[] args) throws Exception{
        method1(); // only compiles unless you used Try & Catch bl;ock OR add Throws Exception in method line

            }



















}
