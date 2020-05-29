package Day44_Exceptions.WarmUp;

public class Unchecked {
    public static void main(String[] args) {
       System.out.println(9/0); // there is no red lines until we run and there is an error
        //Exception in thread "main" java.lang.ArithmeticException: / by zero at Dayy44_Exceptions.WarmUp.Unchecked.main(Unchecked.java:5)

        //if there is already an exception in the code will anything else compile? NO, the below will not print
        System.out.println("test completed");

        String str = "Cybertek";
        System.out.println(str.charAt(-1)); // no compile error until code is ran, then it will output an exception
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1

        int[] arr = {1,2,3};
        System.out.println(arr[200]);// no compile error until code is ran, then it will output an exception
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 200
    }
}
