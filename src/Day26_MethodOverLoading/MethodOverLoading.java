package Day26_MethodOverLoading;
/*
Method Overloading: Multiple methods with the same name, with different paramters using different data types:

         public static void method (int a){}
                       vs.
        public static void method(int a, int b, int c){}

benefits: Easy to read, Re-usable, easy to remember, and very flexible





 */
public class MethodOverLoading {
    public static void method (int a){ // Parameter must be different, datatype or
        System.out.println("Original Method");
    }


    public static void method(double a){
        System.out.println("Overload method");
    }


}
