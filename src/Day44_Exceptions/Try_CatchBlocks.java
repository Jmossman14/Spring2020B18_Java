package Day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class Try_CatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

       // System.out.println(list.get(10)); // there is no index 10, so there will be an outOfBoundsException
        //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 5


        //create a try & catch block
        try{
            System.out.println(list.get(10));   // place the code that didnt compile in the body
        }catch(IndexOutOfBoundsException e){ // e is a preferred name for an exception variableName

            System.out.println("exception has been handled");
        }

        /*
        - the CORRECT exceptionClass (or parentClass) must be given in the CATCH () in order for it to compile.
        If the wrong exceptionClass is given, it will not be handled
        - if the exception in the TRY block works, then the catch statement will not work/print
        - if the exception in the TRY block does NOT work, then the catch statement WILL work/print

         */
    }
}
