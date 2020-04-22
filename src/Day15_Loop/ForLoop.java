package Day15_Loop;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

       /* for(Initialization; condition; Iterator){
            System.out.println();}*/
       for(int i=0; i < 5; i++ ) {// code will run until it is false
                        // Iterator must be FALSE go against the Initialization in order to stop code
           System.out.println("Hello World");
       }
       /*
       1. Initialization
       2. condition
       3. Iterator
       4. statement if TRUE
       5. loops until FALSE
             */


       for(int a=1; a <=10; a += 2 ){
                          // ^ makes statement print everyother loop
           System.out.println(a+" : "+(a*a) ); // allows to find the square root
       }




    }
}
